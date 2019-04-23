package com.shcp.client.utils;

import com.shcp.client.pojo.CacheUser;
import com.shcp.pojo.User;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * @author Yuki
 * @date 2019/4/23 15:28
 */
@Slf4j
public class ChangeEmailPool {

    private static Map<Long, CacheUser> changeEmailCache = Collections.synchronizedMap(new HashMap<>());

    private static final Class CLASS_LOCK = ChangeEmailPool.class;

    private volatile static ChangeEmailPool changeEmailPool;

    private ChangeEmailPool(){}

    public static ChangeEmailPool getInstance(){
        if(changeEmailPool == null){
            synchronized (CLASS_LOCK){
                changeEmailPool = new ChangeEmailPool();
            }
        }
        return changeEmailPool;
    }

    public synchronized CacheUser add(User user, Long time){
        if(user == null || time == null){
            throw new RuntimeException("the instance or time is null");
        }
        CacheUser cacheUser = get(time);
        if(Objects.isNull(cacheUser)){
            cacheUser = changeEmailCache.put(time, new CacheUser(user, new Date()));
        }
        log.info("put userId:{} into forgetCache", user.getUid());
        return cacheUser;
    }

    public synchronized CacheUser get(Long time){
        if(time == null){
            log.error("time is null");
            return null;
        }
        return changeEmailCache.get(time);
    }

    public synchronized boolean remove(Long time){
        if (time == null){
            return false;
        }
        log.info("key:{} remove from registerCache", time);
        return changeEmailPool.remove(time);
    }

}
