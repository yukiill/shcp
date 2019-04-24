package com.shcp.manager.pojo;

import com.shcp.pojo.DeviceLimit;
import com.shcp.pojo.DeviceType;
import lombok.Data;

/**
 * @author Yuki
 * @date 2019/4/24 21:17
 */
@Data
public class DeviceLimitVo {

    private DeviceLimit deviceLimit;

    private DeviceType deviceType;
}
