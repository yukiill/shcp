package com.shcp.client.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @author Yuki
 * @date 2019/4/9 19:13
 */
public class TextTemplate {

    private static final String URL_HEAD = "http://localhost:8080/";

    public static String getCheckEmailSubject(){
        return "验证邮件";
    }

    public static String getCheckEmailTemplate(long userId, long time){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("请点击下列的链接来完成账号验证，方可登录\n");
        stringBuilder.append(URL_HEAD).append("email/check?userId=")
                .append(userId).append("&time=").append(time).append("&eCode=").append(1005);
        return stringBuilder.toString();
    }

    public static String getForgetPassEmailTemplate(Long time){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("请点击下列的链接来完成修改密码，方可使用新密码登录\n");
        stringBuilder.append(URL_HEAD).append("email/checkForget?time=")
                .append(time).append("&eCode=").append(1010);
        return stringBuilder.toString();
    }

    public static String getChangeEmailTemplate(long userId, long time, String email){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("请点击下列的链接来完成邮箱更改，方可完成邮箱更改\n");
        stringBuilder.append(URL_HEAD).append("email/changeEmail?userId=")
                    .append(userId).append("&time=").append(time).append("&email=").append(email)
                    .append("&eCode").append(1015);
        return stringBuilder.toString();
    }
}
