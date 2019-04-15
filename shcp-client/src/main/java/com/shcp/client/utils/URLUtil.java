package com.shcp.client.utils;

/**
 * @author Yuki
 * @date 2019/3/27 20:13
 */
public class URLUtil {

    public static String getEmailCheckUrl(TbUser tbUser, Long time){
        return new StringBuffer().append("/email/sendCheck?").append("userId=").append(tbUser.getUid()).append("&time=").append(time)
                .append("&email=").append(tbUser.getUemail()).append("&type=").append(true)
                .append("&eCode=").append(1005).toString();
    }
}
