package com.jt.common.controller;

import com.jt.common.ServiceException;
import com.jt.common.vo.JsonResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by CGB on 2019/3/14.
 */
@ControllerAdvice
public class ControllerExceptionHandler {
    /**
     * @ExceptionHandler 用于描述这个方法能够处理的异常
     * @param e
     */
    @ExceptionHandler(ServiceException.class)
    @ResponseBody
    public JsonResult handleServiceException(ServiceException e){
      e.printStackTrace();
      return new JsonResult(0,e.getMessage());
    }
}
