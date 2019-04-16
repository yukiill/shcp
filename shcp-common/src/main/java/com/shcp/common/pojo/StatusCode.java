package com.shcp.common.pojo;

/**
 * @author 江冷易水寒
 * @data 2019/4/1 8:11
 */
public enum StatusCode implements StatusCodeInterface{
    Not_Find_Content(404,"找不到资源文件")
    ,Server_Internal_Error(500,"服务器内部错误")
	,Register_Success(600,"注册成功")
    ,Login_Success(600,"登陆成功")
	,Feedback_Success(600,"反馈成功")
	,Binding_Success(600,"绑定成功")
	,Submit_Success(600,"提交成功")
	,Modify_Success(600,"修改成功")
	,Query_Success(600,"查询成功")
	,Mailbox_Verification_Passed(600,"验证通过")
	,Send_Success(600,"发送成功")
	,Mail_Send_PASSED(600,"邮件发送成功")
	,Cancellation_Success(600,"注销成功")
	,Response_Success(600,"响应成功")
    ,Password_Modify_Success(605,"修改成功")
    ,Username_OR_Password_Error(651,"用户名或密码错误")
    ,Username_Registered(652,"用户名已注册")
    ,Passwords_different(653,"密码和重复密码不一致")
    ,Mail_Format_Error(654,"邮箱格式错误")
	,Mailbox_Verification_Overtime(655,"验证超时")
	,Mail_Send_FAIL(657,"邮件发送失败")
	,Server_Reject_Acceptance(658,"目标邮件服务器拒绝接受")
	,User_NotRegister(659,"用户未注册")
    ,Binding_Fail(661,"绑定失败")
	,Query_Fail(662,"查询失败")
	,Feedback_Fail(664,"反馈失败")
	,Not_Fount_User(663,"找不到该用户")
	,Device_Inexistence(663,"设备不存在")
    ,Device_Not_Found(664,"找不到该设备")
	,Not_Find_Device(665,"找不到指定设备")
    ,Device_Not_Limit(665,"该设备无此权限")
	,Request_Overtime(666,"请求超时")
	,No_Record(669,"无记录")
	,UserNotLogin(680,"用户未登录")
	,Username_Not_Exist(691,"用户名不存在");

    private int code;
    private String msg;

    @Override
    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

     StatusCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public static StatusCode getInfoByStatusCode(int code){
        for(StatusCode statusCode : StatusCode.values()){
            if(statusCode.equals(code)){
                return statusCode;
            }
        }
        return null;
    }

    public static StatusCode getInfoByStatusCode(String msg){
        for(StatusCode statusCode : StatusCode.values()){
            if(statusCode.equals(msg)){
                return statusCode;
            }
        }
        return null;
    }

}

