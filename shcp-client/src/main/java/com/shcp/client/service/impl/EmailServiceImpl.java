package com.shcp.client.service.impl;

import com.shcp.client.pojo.CacheUser;
import com.shcp.client.service.EmailService;
import com.shcp.client.utils.*;
import com.shcp.common.pojo.ShcpResult;
import com.shcp.dao.mapper.TbUserMapper;
import com.shcp.pojo.TbUser;
import com.shcp.pojo.TbUserExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.Cookie;
import javax.xml.soap.Text;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

/**
 * @author Yuki
 * @date 2019/3/25 22:13
 */
@Slf4j
@Service("emailService")
public class EmailServiceImpl implements EmailService{

    @Resource
    private JavaMailSender javaMailSender;
    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public ShcpResult checkForgetPass(Long time) {
        ForgetPasswordPool forgetPasswordPool = ForgetPasswordPool.getInstance();
        CacheUser cacheUser = forgetPasswordPool.get(time);
        if(Objects.isNull(cacheUser)){
            log.info("this is no corresponding object time:{}", time);
            return ShcpResult.build(714, "验证失败");
        }
        if(cacheUser.isExpired()){
            log.info("verify forgetPass email expired");
            return ShcpResult.build(655, "超过验证时限，请重新发送验证邮件");
        }
        tbUserMapper.updateByPrimaryKeySelective(cacheUser.getTbUser());
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult check(Long userId, Long time) {
        RegisterCachePool registerCachePool = RegisterCachePool.getInstance();
        CacheUser cacheUser  = registerCachePool.get(time);
        if(Objects.isNull(cacheUser)){
            log.info("this is no corresponding object userId:{} time:{}", userId, time);
            return ShcpResult.build(714, "验证失败");
        }
        if(cacheUser.isExpired()){
            log.info("userId:{} verify email expired", userId);
            return ShcpResult.build(655, "超过验证时限，请重新发送验证邮件");
        }
        TbUser tbUser = cacheUser.getTbUser();
        if(Objects.equals(tbUser.getUid(), userId)) {
            tbUserMapper.insertSelective(tbUser);
            FileUtil.mkdirForUser(tbUser.getUsername());
            log.info("userId:{} time:{} check successful verification", userId, time);
            registerCachePool.remove(time);
            return ShcpResult.ok();
        }
        return ShcpResult.build(714, "验证失败");
    }

    @Override
    public ShcpResult sendCheckEmail(Long userId, Long time, String email, boolean type){
        RegisterCachePool registerCachePool = RegisterCachePool.getInstance();
        CacheUser cacheUser = registerCachePool.get(time);
        if(cacheUser.isAllowToSend()){
            cacheUser.setExpiredTimeAndDecrCount();
            log.info("send check email to userID:{}, email:{}", userId, email);
            if(sendEmail(TextTemplate.getCheckEmailTemplate(userId, time), TextTemplate.getCheckEmailSubject(), email, type)){
                log.info("send check email to userId:{} successed", userId);
                return ShcpResult.ok();
            }
            return ShcpResult.build(711, "邮件发送失败");
        }
        log.info("this userId:{} excess to send check email", userId);
        return ShcpResult.build(712, "在短时间内请求过多，请等一段时间后再尝试");
    }

    @Override
    public ShcpResult sendForgetPassEmail(Long time, String email, String password, boolean type) {
        ForgetPasswordPool forgetPasswordPool = ForgetPasswordPool.getInstance();
        CacheUser cacheUser = forgetPasswordPool.get(time);
        if(Objects.isNull(cacheUser)){
            log.info("send forgetPass email to email:{}", email);
            TbUserExample tbUserExample = new TbUserExample();
            tbUserExample.createCriteria()
                    .andUemailEqualTo(email);
            TbUser tbUser = tbUserMapper.selectByExample(tbUserExample).get(0);
            if(Objects.isNull(tbUser)){
                log.info("email:{} haven't opposite user", email);
                return ShcpResult.build(715, "邮箱未绑定");
            }
            tbUser.setPassword(password);
            cacheUser = forgetPasswordPool.add(tbUser, time);
        }
        if(cacheUser.isAllowToSend()){
            if(sendEmail(TextTemplate.getForgetPassEmailTemplate(time), TextTemplate.getCheckEmailSubject(), email, type)){
                log.info("send check forgetPass email to email:{} successed", email);
                cacheUser.setExpiredTimeAndDecrCount();
                return ShcpResult.ok();
            } else {
                return ShcpResult.build(657, "邮件发送失败");
            }

        }
        log.info("excess to send forgetPass email");
        return ShcpResult.build(712, "在短时间内请求过多，请等一段时间后再尝试");
    }

    @Override
    public boolean sendEmail(String text, String subject, String emailAddress, boolean type) {
        //创建邮件对象
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper;
        Properties properties = new Properties();
        try {
            //从配置文件中拿到发件人邮箱
            properties.load(this.getClass().getClassLoader().getResourceAsStream("properties/mail.properties"));
            String from = properties.get("mail.smtp.username") + "";
            mimeMessageHelper = new MimeMessageHelper(mimeMessage, true, "utf-8");
            //发件人邮箱
            mimeMessageHelper.setFrom(from);
            //收件人首相
            mimeMessageHelper.setTo(emailAddress);
            //邮件标题
            mimeMessageHelper.setSubject(subject);
            //邮件的文本内容，是否以html格式打开
            mimeMessageHelper.setText(text);
            javaMailSender.send(mimeMessage);
            return true;
        } catch (MessagingException | IOException e) {
            log.info("send email failed message:{}", e.getMessage());
            return false;
        }
    }

}
