package com.shcp.client.service.impl;

import com.gracelie.shcp.cpcsconn.config.Configuration;
import com.gracelie.shcp.cpcsconn.config.sendmessage.Message;
import com.gracelie.shcp.cpcsconn.config.sendmessage.MessageUtils;
import com.gracelie.shcp.cpcsconn.config.sendmessage.SendMessage;
import com.shcp.client.service.DeviceService;
import com.shcp.client.utils.MessageUtil;
import com.shcp.common.pojo.ShcpResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * @author Yuki
 * @date 2019/4/1 20:47
 */
@Slf4j
@Service
public class DeviceServiceImpl implements DeviceService{

    @Resource
    private TbDeviceMapper tbDeviceMapper;

    @Override
    public ShcpResult getDeviceListByUserId(Long userId) {
        if(Objects.isNull(userId)){
            log.info("userid should not be null");
            return ShcpResult.build(7777, "用户状态异常");
        }
        TbDeviceExample tbDeviceExample = new TbDeviceExample();
        tbDeviceExample.createCriteria()
                .andUidEqualTo(userId);
        List<TbDevice> tbDevices =  tbDeviceMapper.selectByExample(tbDeviceExample);
        //TODO 获取Device基础信息后，将设备状态信息也包装进TbDevice中
        tbDevices.stream().parallel().forEach(tbDevice -> {
            Configuration configuration = Configuration.getInstance(tbDevice.getDsipaddr(), tbDevice.getDsport());
            Message message = MessageUtil.getMessage(tbDevice, Message.NOMORL_PRIORITY, "", "", false);
            String coment = MessageUtils.messageToComent(message);
            SendMessage sendMessage = new SendMessage();
            sendMessage.send();
        });
        log.info("userId:{} query device list success", userId);
        return ShcpResult.ok(tbDevices);
    }

    @Override
    public ShcpResult bindDevice(Long dstID, TbUser tbUser) {
        TbDevice tbDevice = tbDeviceMapper.selectByPrimaryKey(dstID);
        if(Objects.isNull(tbDevice)){
            log.info("userId:{} bind dstID:{} failed, opposite device isn't exist", tbUser.getUid(), dstID);
            return ShcpResult.build(661, "绑定失败");
        }
        tbDevice.setUid(tbUser.getUid());
        tbDevice.setDid(tbUser.getDid());
        tbDeviceMapper.updateByPrimaryKeySelective(tbDevice);
        log.info("userId:{} bind dstID:{} successful", tbUser.getUid(), dstID);
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult getDeviceStatus(Long deviceID) {
        TbDevice tbDevice = tbDeviceMapper.selectByPrimaryKey(deviceID);
        if(Objects.isNull(tbDevice)){
            log.info("Failed to obtain device information deviceID:{}", deviceID);
        }
        //TODO 发送信息并接受回传
        Configuration configuration = Configuration.getInstance(tbDevice.getDsipaddr(), tbDevice.getDsport());
        Message message = MessageUtil.getMessage(tbDevice, Message.NOMORL_PRIORITY, "", "", false);
        String coment = MessageUtils.messageToComent(message);
        SendMessage sendMessage = new SendMessage();
        sendMessage.setMessage(message);
        sendMessage.send();
        return ShcpResult.ok();
    }
}
