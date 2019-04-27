package com.shcp.client.exception;

/**
 * @author Yuki
 * @date 2019/4/21 19:58
 */
public class AccessDeniedException extends Exception{

    public String message;

    public AccessDeniedException(String message){
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }
}
