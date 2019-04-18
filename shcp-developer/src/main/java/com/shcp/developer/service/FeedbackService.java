package com.shcp.developer.service;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.pojo.Developer;

/**
 * @author Yuki
 * @date 2019/4/11 10:55
 */
public interface FeedbackService {

    ShcpResult submitDevFeedback(Developer tbDeveloper, String content, String title);

    ShcpResult getAllRepies(Developer tbDeveloper, Long FID, int rows, int page);

    ShcpResult getAllFeedback(Developer tbDeveloper, int rows, int page);

    ShcpResult getFeedbackByFID(Developer tbDeveloper, String FbId);

    ShcpResult getFeedbackByWd(Developer tbDeveloper,String wd, int rows, int page);

    ShcpResult replyFeedback(Developer tbDeveloper, String FbId, String fbContent);
}
