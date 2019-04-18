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

    public synchronized static long generateDeviceTypeId(){
        return System.nanoTime() * 2;
    }

    public synchronized static long generateDeviceCtrlId(){
        return System.nanoTime() * 4;
    }

    public synchronized static long generateDeviceStatusId(){
        return System.nanoTime() * 3;
    }

    public synchronized static long generateTestDeviceId(){
        return System.nanoTime() * 6;
    }

    public synchronized static long generateTestDeviceStatusId(){
        return System.nanoTime() * 7;
    }

    public synchronized  static long generateTestDeviceLimitId(){
        return System.nanoTime() * 8;
    }

    public synchronized  static long generateTestDeviceControlId(){
        return System.nanoTime() * 9;
    }


}
