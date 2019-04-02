package com.shcp.client.service.impl;

import com.shcp.client.service.EmailService;
import com.shcp.client.utils.FileUtil;
import com.shcp.client.utils.RegisterCachePool;
import com.shcp.dao.mapper.TbUserMapper;
import com.shcp.pojo.TbUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;
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
    public Boolean check(Integer userId, Long time) {
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
    public String sendEmail(Integer userId, Long time, String text, String subject, String emailAddress, Boolean type){
        //创建邮件对象
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper;
        Properties properties = new Properties();
        try{
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
            mimeMessageHelper.setText(text + generateCheckUrl(userId,time), type);
            javaMailSender.send(mimeMessage);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "发送成功";
    }

    private String generateCheckUrl(Integer userId, Long time){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("http://localhost:8080/email/check?userId=")
                .append(userId).append("&time=").append(time).append("&eCode=").append(1005);
        return stringBuffer.toString();
    }
}
