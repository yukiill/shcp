package com.shcp.client.utils;

import com.github.pagehelper.StringUtil;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Objects;

/**
 * @author Yuki
 * @date 2019/4/10 14:16
 */
public class CookieUtil {

    private final static String COOKIE_NAME = "token";
    private final static String COOKIE_PATH = "/";

    public static void addCookie(HttpServletRequest request, HttpServletResponse response){
        String string = getCookieValue(request);
        if(!StringUtil.isEmpty(string) && Objects.equals("-1", string)){
            Cookie cookie = new Cookie(COOKIE_NAME, String.valueOf(System.nanoTime()));
            //设置过期时间为24小时
            cookie.setMaxAge(86400);
            cookie.setPath(COOKIE_PATH);
            response.addCookie(cookie);
        }
    }

    public static String getCookieValue(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        for(Cookie cookie: cookies){
            if(Objects.equals(COOKIE_NAME, cookie.getName().trim())){
                return cookie.getValue();
            }
        }
        return "-1";
    }

    public static void deleteCookie(String name, HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        for(Cookie cookie : cookies){
            if(Objects.equals(COOKIE_NAME, cookie.getName().trim())){
                cookie.setMaxAge(-1);
                return;
            }
        }
    }
}
