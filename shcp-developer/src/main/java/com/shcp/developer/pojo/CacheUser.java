package com.shcp.developer.pojo;

import com.shcp.pojo.TbDeveloper;
import lombok.Data;

import java.util.Date;

/**
 * @author Yuki
 * @date 2019/4/10 12:29
 */
@Data
public class CacheUser {

    private TbDeveloper tbDeveloper;
    private int sendCount;
    private long latestExpiredTime;
    private long nextTimeAllowToSend;
    private long interval;

    public CacheUser(TbDeveloper tbDeveloper, Date date){
        this.tbDeveloper = tbDeveloper;
        this.sendCount = 5;
        this.latestExpiredTime = -1;
        this.interval = 600000;
        this.nextTimeAllowToSend = date.getTime() + this.interval;
    }

    public boolean isAllowToSend(){
        long time = new Date().getTime();
        if(this.nextTimeAllowToSend >= time){
            return this.sendCount > 0;
        }
        reset(time);
        return true;
    }

    public void reset(long time){
        this.sendCount = 5;
        this.nextTimeAllowToSend  = time + 600000;
    }

    public void setExpiredTimeAndDecrCount(){
        this.latestExpiredTime = new Date().getTime();
        this.sendCount -= 1;
    }

    public boolean isExpired(){
        return this.getLatestExpiredTime() > new Date().getTime();
    }
}
