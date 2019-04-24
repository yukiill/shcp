package com.shcp.manager.pojo;

import com.shcp.pojo.DeviceStatus;
import com.shcp.pojo.DeviceType;
import lombok.Data;

/**
 * @author Yuki
 * @date 2019/4/24 21:34
 */
@Data
public class DeviceStatusVo {

    private DeviceStatus deviceStatus;

    private DeviceType deviceType;
}
