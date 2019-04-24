package com.shcp.manager.utils;

/**
 * @author Yuki
 * @date 2019/4/23 21:58
 */
public class IdGenerator {

    public static synchronized short getUserLimitId(){
        return (short) System.currentTimeMillis();
    }
}
