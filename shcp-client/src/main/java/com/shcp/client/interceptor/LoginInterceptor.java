package com.shcp.client.interceptor;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.common.utils.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

/**
 * @author Yuki
 * @date 2019/4/1 0:13
 */
@Slf4j
@Component
public class LoginInterceptor implements HandlerInterceptor{

    @Resource
    private HttpSession session;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.setContentType("application/json;charset=utf-8");
        Object currentUser = session.getAttribute("user");
        if(Objects.isNull(currentUser)){
            try(PrintWriter writer = response.getWriter()){
                writer.println(JsonUtil.objectToJson(ShcpResult.build(100, "用户未登录")));
            } catch (IOException e){
                log.error("interceptor response error {}", e.getMessage());
            }
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
