package com.shcp.client.service;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.pojo.User;

/**
 * @author Yuki
 * @date 2019/4/21 15:06
 */
public interface FeedbackService {

    /**
     * 提交一个反馈
     * @param user 提交反馈的用户
     * @param content 内容
     * @param title 标题
     * @param type 反馈类型
     * @param to_user_id 0代表官方，其他为提供设备的开发者
     * @return 响应信息
     */
    ShcpResult submitFeedback(User user, String content, String title, Short type, long to_user_id);

    ShcpResult getReplyById(long RID);

    ShcpResult getAllReplies(long UID, int page, int rows);
}
