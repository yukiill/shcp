package com.shcp.client.service;

import org.springframework.mail.javamail.JavaMailSender;

/**
 * @author Yuki
 * @date 2019/3/25 22:10
 */
public interface EmailService {

    Boolean check(Integer userId, Long time);

    String sendEmail(Integer userId, Long time, String text, String subject, String emailAddress, Boolean type);

}
