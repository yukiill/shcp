package com.shcp.client.annotation;

import java.lang.annotation.*;

/**
 * @author Yuki
 * @date 2019/4/21 19:30
 */
@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface ValidatePermission {

    /**
     * @Description功能Id的参数索引位置 默认为0，表示功能id在第一个参数的位置上，-1则表示未提供，无法进行校验
     */
    int idx() default 0;
}
