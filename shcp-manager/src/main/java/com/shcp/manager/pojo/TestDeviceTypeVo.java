package com.shcp.manager.pojo;

import com.shcp.pojo.Developer;
import com.shcp.pojo.TestDeviceType;
import lombok.Data;

/**
 * @author Yuki
 * @date 2019/4/25 20:50
 */
@Data
public class TestDeviceTypeVo {

    private TestDeviceType testDeviceType;

    private Developer developer;
}
