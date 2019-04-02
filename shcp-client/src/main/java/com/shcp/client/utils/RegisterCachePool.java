package com.shcp.client.utils;

import com.shcp.pojo.TbUser;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * @author Yuki
 * @date 2019/3/26 21:16
 */
@Slf4j
public class RegisterCachePool {

    private static Map<Long, TbUser> registerCache = Collections.synchronizedMap(new HashMap<>());

    private static final Class CLASS_LOCK = RegisterCachePool.class;

    private static RegisterCachePool registerCachePool;

    private RegisterCachePool(){}

    public static RegisterCachePool getInstance(){
        synchronized (CLASS_LOCK){
            if(registerCachePool == null){
                registerCachePool = new RegisterCachePool();
            }
        }
        return registerCachePool;
    }

    /**
     * 往注册缓存池中放入一个待验证的用户实体
     * @param tbUser 用户实体
     * @param time 当前时间戳,纳秒级
     * @return 是否插入成功
     */
    public synchronized boolean add(TbUser tbUser, Long time){
        if(tbUser == null || time == null){
            throw new RuntimeException("the instance or time is null");
        }
        registerCache.put(time, tbUser);
        log.info("put userId:{} into registerCache", tbUser.getUid());
        return true;
    }

    public synchronized TbUser get(Long time){
        if(time == null){
            log.error("time is null");
            return null;
        }
        return registerCache.get(time);
    }

    public synchronized boolean remove(Long time){
        if (time == null){
            return false;
        }
        log.info("key:{} remove from registerCache", time);
        registerCache.remove(time);
        return true;
    }
}
