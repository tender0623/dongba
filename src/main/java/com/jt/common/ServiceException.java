package com.jt.common;

/**
 * Created by CGB on 2019/3/14.
 */

/**
 * 自定义异常第对异常信息进行更加细致描述,便于我们对异常进行更急精确的分析
 */
public class ServiceException extends  RuntimeException {
    private static final long serialVersionUID = 6347845764534934816L;

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
