package com.shcp.developer.utils;

import com.shcp.developer.pojo.CacheUser;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * @author Yuki
 * @date 2019/3/26 21:16
 */
@Slf4j
public class RegisterCachePool{

    private static Map<Long, CacheUser> registerCache = Collections.synchronizedMap(new HashMap<>());
    private static Set<String> usernameCache = Collections.synchronizedSet(new HashSet<>());

    private static final Class CLASS_LOCK = RegisterCachePool.class;

    private volatile static RegisterCachePool registerCachePool;

    private RegisterCachePool(){}

    public static RegisterCachePool getInstance(){
        if(registerCachePool == null){
            synchronized (CLASS_LOCK){
                registerCachePool = new RegisterCachePool();
            }
        }
        return registerCachePool;
    }

    /**
     * 往注册缓存池中放入一个待验证的用户实体
     * @param tbDeveloper 开发者实体
     * @param time 当前时间戳,纳秒级
     * @return 是否插入成功
     */
    public synchronized CacheUser add(TbDeveloper tbDeveloper, Long time){
        if(tbDeveloper == null || time == null){
            throw new RuntimeException("the instance or time is null");
        }
        CacheUser cacheUser = get(time);
        if(Objects.isNull(cacheUser)){
            cacheUser = registerCache.put(time, new CacheUser(tbDeveloper, new Date()));
        }
        usernameCache.add(tbDeveloper.getDevname());
        log.info("put userId:{} into registerCache and usernameCache", tbDeveloper.getDid());
        return cacheUser;
    }

    public synchronized CacheUser get(Long time){
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
        CacheUser cacheUser = registerCache.remove(time);
        usernameCache.remove(cacheUser.getTbDeveloper().getDevname());
        return true;
    }

    public synchronized boolean isUsernameExistInCache(String username){
        if(StringUtils.isEmpty(username)){
            throw new IllegalArgumentException("username is null or no length");
        }
        return usernameCache.contains(username);
    }

}
