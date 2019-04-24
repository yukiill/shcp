package com.shcp.manager.pojo;

import com.shcp.pojo.Developer;
import com.shcp.pojo.Device;
import com.shcp.pojo.DeviceType;
import com.shcp.pojo.User;
import lombok.Data;

/**
 * @author Yuki
 * @date 2019/4/24 20:19
 */
@Data
public class DeviceVo{

    private Device device;

    private DeviceType deviceType;

    private Developer developer;

    private User user;
}
