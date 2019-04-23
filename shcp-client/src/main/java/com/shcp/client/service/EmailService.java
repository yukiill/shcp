package com.shcp.client.service;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.pojo.User;
import org.springframework.mail.javamail.JavaMailSender;

/**
 * @author Yuki
 * @date 2019/3/25 22:10
 */
public interface EmailService {

    ShcpResult check(Long userId, Long time);

    ShcpResult checkForgetPass(Long time);

    boolean checkChangeEmail(long userId, long time, String email);

    ShcpResult sendCheckEmail(Long userId, Long time, String email, boolean type);

    ShcpResult sendForgetPassEmail(Long time, String email, String password, boolean type);

    ShcpResult sendChangeEmail(User user, String email, boolean type);

    boolean sendEmail(String text, String subject, String emailAddress, boolean type);
}
