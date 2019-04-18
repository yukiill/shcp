package com.shcp.client.utils;

import com.gracelie.shcp.cpcsconn.config.sendmessage.InlayMessage;
import com.gracelie.shcp.cpcsconn.config.sendmessage.Message;
import com.shcp.pojo.Device;

/**
 * @author Yuki
 * @date 2019/4/9 11:07
 */
public class MessageUtil {

    public static Message getMessage(Device device, int priority, String ctrKey, String ctrValue, boolean encryption){
        InlayMessage inlayMessage = new InlayMessage();
        inlayMessage.setDevicsId(device.getDeid());
        inlayMessage.setPriority(priority);
        inlayMessage.setEncryption(false);
        inlayMessage.setCtrKey(ctrKey);
        inlayMessage.setCtrValue(ctrValue);
        return inlayMessage;
    }
}
