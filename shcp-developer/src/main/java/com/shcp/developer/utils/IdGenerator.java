package com.shcp.developer.utils;

/**
 * @author Yuki
 * @date 2019/4/1 14:14
 */
public class IdGenerator {


    public synchronized static long generateUserId(){
        return System.nanoTime();
    }

    public synchronized static long generateDeveloporId(){
        return System.currentTimeMillis();
    }

    public synchronized static long generateFeedbackId(){
        return System.nanoTime() * 10;
    }

    public synchronized static long generateExamineId(){
        return System.nanoTime() * 5;
    }
}