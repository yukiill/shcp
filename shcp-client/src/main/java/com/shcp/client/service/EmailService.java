package com.shcp.client.service;

import org.springframework.mail.javamail.JavaMailSender;

/**
 * @author Yuki
 * @date 2019/3/25 22:10
 */
public interface EmailService {

    Boolean check(Long userId, Long time);

    Boolean checkForgetPass(Long time);

    boolean sendCheckEmail(Long userId, Long time, String email, boolean type);

    boolean sendForgetPassEmail(Long time, String email, boolean type);

    boolean sendEmail(String text, String subject, String emailAddress, boolean type);
}
