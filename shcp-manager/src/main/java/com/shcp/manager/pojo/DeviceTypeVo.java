package com.shcp.manager.pojo;

import com.shcp.pojo.Developer;
import com.shcp.pojo.DeviceType;
import lombok.Data;

/**
 * @author Yuki
 * @date 2019/4/24 20:43
 */
@Data
public class DeviceTypeVo {

    private DeviceType deviceType;

    private Developer developer;
}
