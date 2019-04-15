package com.shcp.developer.service;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.pojo.TbDeveloper;

/**
 * @author Yuki
 * @date 2019/4/11 10:55
 */
public interface FeedbackService {

    ShcpResult submitDevFeedback(TbDeveloper tbDeveloper, String content, String title);
}
