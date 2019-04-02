package com.shcp.common.utils;

import org.apache.ibatis.annotations.Param;
import org.springframework.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Yuki
 * @date 2019/3/25 21:36
 */
public class StringUtil {

    private static Pattern pattern = Pattern.compile("^[A-Za-z\\d]+([-_.][A-Za-z\\d]+)*@([A-Za-z\\d]+[-.])+[A-Za-z\\d]{2,4}$");

    public static boolean isCorrect(String email){
        if(StringUtils.isEmpty(email)) {
            throw new IllegalArgumentException("email is null or no length string");
        }
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
