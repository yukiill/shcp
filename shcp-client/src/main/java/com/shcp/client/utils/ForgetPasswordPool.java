package com.shcp.client.utils;

import com.shcp.client.pojo.CacheUser;
import com.shcp.pojo.User;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * @author Yuki
 * @date 2019/4/10 13:13
 */
@Slf4j
public class ForgetPasswordPool {

    private static Map<Long, CacheUser> forgetCache = Collections.synchronizedMap(new HashMap<>());

    private static final Class CLASS_LOCK = ForgetPasswordPool.class;

    private volatile static ForgetPasswordPool forgetPasswordPool;

    private ForgetPasswordPool(){}

    public static ForgetPasswordPool getInstance(){
        if(forgetPasswordPool == null){
            synchronized (CLASS_LOCK){
                forgetPasswordPool = new ForgetPasswordPool();
            }
        }
        return forgetPasswordPool;
    }

    public synchronized CacheUser add(User user, Long time){
        if(user == null || time == null){
            throw new RuntimeException("the instance or time is null");
        }
        CacheUser cacheUser = get(time);
        if(Objects.isNull(cacheUser)){
            cacheUser = forgetCache.put(time, new CacheUser(user, new Date()));
        }
        log.info("put userId:{} into forgetCache", user.getUid());
        return cacheUser;
    }

    public synchronized CacheUser get(Long time){
        if(time == null){
            log.error("time is null");
            return null;
        }
        return forgetCache.get(time);
    }
}
