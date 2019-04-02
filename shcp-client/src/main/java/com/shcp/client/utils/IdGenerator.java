package com.shcp.client.utils;

/**
 * @author Yuki
 * @date 2019/4/1 14:14
 */
public class IdGenerator {


    public synchronized static long generateUserId(){
        return System.nanoTime();
    }

    public synchronized static long generateDevelopor(){
        return System.currentTimeMillis();
    }

    public synchronized static long generateFeedbackId(){
        return System.nanoTime() * 10;
    }
}
