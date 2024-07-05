package org.boy.exception;


/**
 * @author tanglijie
 * @date 2024/7/5 上午10:21
 * @description  逻辑业务异常
 **/
public class ServiceException extends RuntimeException {
    public ServiceException(String msg) {
        super(msg);
        super.printStackTrace();
    }
}
