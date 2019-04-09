package com.shcp.common.utils;

import com.shcp.common.utils.JsonUtil;
import org.springframework.http.converter.json.MappingJacksonValue;

/**
 * @author Yuki
 * @date 2019/4/5 19:18
 * 跨域访问的工具类
 */
public class CorsUtil {

    public static Object format(Object object){
        MappingJacksonValue value = new MappingJacksonValue(object);
        value.setJsonpFunction("successCallback");
        return value;
    }
}
