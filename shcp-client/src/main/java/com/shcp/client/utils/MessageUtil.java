package com.shcp.client.utils;

import com.gracelie.shcp.cpcsconn.config.sendmessage.InlayMessage;
import com.gracelie.shcp.cpcsconn.config.sendmessage.Message;
import com.shcp.pojo.TbDevice;

/**
 * @author Yuki
 * @date 2019/4/9 11:07
 */
public class MessageUtil {

    public static Message getMessage(TbDevice tbDevice, int priority, String ctrKey, String ctrValue, boolean encryption){
        InlayMessage inlayMessage = new InlayMessage();
        inlayMessage.setDevicsId(tbDevice.getDid());
        inlayMessage.setPriority(priority);
        inlayMessage.setEncryption(false);
        inlayMessage.setCtrKey(ctrKey);
        inlayMessage.setCtrValue(ctrValue);
        return inlayMessage;
    }
}
