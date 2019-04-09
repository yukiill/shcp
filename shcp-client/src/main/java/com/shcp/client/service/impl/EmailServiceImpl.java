package com.shcp.client.service.impl;

import com.shcp.client.service.EmailService;
import com.shcp.client.utils.FileUtil;
import com.shcp.client.utils.RegisterCachePool;
import com.shcp.client.utils.TextTemplate;
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
    public Boolean checkForgetPass(Long time) {
        if(Objects.isNull(time)){
            return false;
        }
        System.err.println("完成的进入的该方法中");
        return true;
    }

    @Override
    public Boolean check(Long userId, Long time) {
        if(Objects.isNull(userId) || Objects.isNull(time)){
            return false;
        }
        RegisterCachePool registerCachePool = RegisterCachePool.getInstance();
        TbUser tbUser = registerCachePool.get(time);
        if(Objects.equals(tbUser.getUid(), userId)) {
            tbUserMapper.insertSelective(tbUser);
            FileUtil.mkdirForUser(tbUser.getUsername());
            log.info("userId:{} time:{} check successful verification", userId, time);
            registerCachePool.remove(time);
            return true;
        }
        return false;
    }

    @Override
    public boolean sendCheckEmail(Long userId, Long time, String email, boolean type){
            log.info("send check email to userID:{}, email:{}", userId, email);
            if(sendEmail(TextTemplate.getCheckEmailTemplate(userId, time), TextTemplate.getCheckEmailSubject(), email, type)){
                log.info("send check email to userId:{} successed", userId);
                return true;
            }
            return false;
    }

    @Override
    public boolean sendForgetPassEmail(Long time, String email, boolean type) {
        log.info("send forgetpass email to email:{}", email);
        TbUserExample tbUserExample = new TbUserExample();
        tbUserExample.createCriteria()
                .andUemailEqualTo(email);
        if(Objects.isNull(tbUserMapper.selectByExample(tbUserExample).get(0))){
            log.info("email:{} haven't opposite user", email);
            return false;
        }
        if(sendEmail(TextTemplate.getForgetPassEmailTemplate(time), TextTemplate.getCheckEmailSubject(), email, type)){
            log.info("send check email to email:{} successed", email);
            return true;
        }
        return false;
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
