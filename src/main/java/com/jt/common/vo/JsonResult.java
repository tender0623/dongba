package com.jt.common.vo;

/**
 * Created by CGB on 2019/3/14.
 */

/**
 * 借助此类对控制层返回的数据进行统一分装
 * 便于在客户端对数据进行更好处理
 */
public class JsonResult {
    /**状态码*/
    private int state=1;
    /**与状态码对应的具体消息
     * state=0 表示业务完成失败
     * state=1 表示业务完成
     * */
    private String message="OK";
    /**j借助此属性封装服务端返回分具体数据 假如查询的结果*/
    private Object data;

    public JsonResult() {
    }
    public JsonResult(int state,String message,Object data) {
        this.state=state;
        this.message=message;
        this.data=data;
    }
    public JsonResult(int state,String message) {
        this.state=state;
        this.message=message;
    }

    public int getState() {
        return state;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }
}
