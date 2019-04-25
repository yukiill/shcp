package com.shcp.manager.pojo;

import com.shcp.pojo.Developer;
import com.shcp.pojo.TestDevice;
import com.shcp.pojo.TestDeviceType;
import lombok.Data;

/**
 * @author Yuki
 * @date 2019/4/25 20:58
 */
@Data
public class TestDeviceVo {

    private TestDevice testDevice;

    private TestDeviceType testDeviceType;

    private Developer developer;

}
