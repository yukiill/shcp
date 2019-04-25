package com.shcp.manager.pojo;

import com.shcp.pojo.TestDeviceLimit;
import com.shcp.pojo.TestDeviceType;
import lombok.Data;

/**
 * @author Yuki
 * @date 2019/4/25 20:34
 */
@Data
public class TestDeviceLimitVo {

    private TestDeviceType  testDeviceType;

    private TestDeviceLimit testDeviceLimit;
}
