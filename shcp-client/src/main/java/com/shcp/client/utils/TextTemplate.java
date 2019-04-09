package com.shcp.client.utils;

/**
 * @author Yuki
 * @date 2019/4/9 19:13
 */
public class TextTemplate {

    public static String getCheckEmailSubject(){
        return "验证邮件";
    }

    public static String getCheckEmailTemplate(Long userId, Long time){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("请点击下列的链接来完成账号验证，方可登录\n");
        stringBuilder.append("http://localhost:8080/email/check?userId=")
                .append(userId).append("&time=").append(time).append("&eCode=").append(1005);
        return stringBuilder.toString();
    }

    public static String getForgetPassEmailTemplate(Long time){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("请点击下列的链接来完成修改密码，方可使用新密码登录\n");
        stringBuilder.append("http://localhost:8080/email/checkForget?time=")
                .append(time).append("&eCode=").append(1010);
        return stringBuilder.toString();
    }
}
