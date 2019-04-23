package com.shcp.client.aspect;

import com.shcp.client.annotation.ValidatePermission;
import com.shcp.client.exception.AccessDeniedException;
import com.shcp.client.service.UserPermissionService;
import com.shcp.pojo.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;

/**
 * @author Yuki
 * @date 2019/4/21 19:15
 */

public class PermissionAspect {

    @Resource
    private HttpSession httpSession;
    @Resource
    private UserPermissionService userPermissionService;

    public void doBefore(JoinPoint joinPoint) throws AccessDeniedException {
        Method sourceMethod = getSourceMethod(joinPoint);
        if(sourceMethod != null){
            ValidatePermission oper = sourceMethod.getAnnotation(ValidatePermission.class);
            if(oper != null){
                int fIdx = oper.idx();
                Object[] args = joinPoint.getArgs();
                if(fIdx >= 0 && fIdx < args.length){
                    long functionId = (long) args[fIdx];
                    User user = (User) httpSession.getAttribute("user");
                    String rs = userPermissionService.permissionValidate(user, functionId);
                    System.out.println("permission result is " + rs);
                    if(rs.trim().isEmpty()){
                        return; //正常
                    }
                }
            }
        }
        throw new AccessDeniedException("您无权操作!");
    }

    private Method getSourceMethod(JoinPoint jp){
        Method proxyMethod = ((MethodSignature) jp.getSignature()).getMethod();
        try {
            return jp.getTarget().getClass().getMethod(proxyMethod.getName(), proxyMethod.getParameterTypes());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}
