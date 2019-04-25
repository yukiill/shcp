package com.shcp.manager.pojo;

import com.shcp.pojo.TestDeviceStatus;
import com.shcp.pojo.TestDeviceType;
import lombok.Data;

/**
 * @author Yuki
 * @date 2019/4/25 20:37
 */
@Data
public class TestDeviceStatusVo {

    private TestDeviceStatus testDeviceStatus;

    private TestDeviceType testDeviceType;
}
