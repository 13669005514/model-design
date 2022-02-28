package com.supermap.model.config;


import lombok.Getter;


/**
 * @author : zhangfx 2020/1/15 17:42
 * @version : 1.0
 */
@Getter
public enum ResultCodeEnum {

    SUCCESS(true,2000,"成功"),
    PARAM_ERROR(false,4000,"请求参数错误"),
    NOT_ALLOWED_ERROR(false,4001,"AOP参数异常,请勿请求非法参数"),
    NOT_SUPPORT_ERROR(false,4002,"不支持当前的HTTP请求方式"),
    NULL_POINT(false,5000,"空指针异常"),
    SQL_ERROR(false,5001,"执行SQL异常"),
    FILE_ERROR(false,5002,"文件未找到异常"),
    ARRAY_INDEX_OUT_ERROR(false,5003,"数组越界异常"),
    CONNECT_ERROR(false,5004,"请求连接超时异常"),
    REDIS_ERROR(false,5005,"Redis服务调用异常"),
    UNKNOWN_ERROR(false,6000,"未知错误 请联系管理员!!!");
    // 响应是否成功
    private Boolean success;
    // 响应状态码
    private Integer code;
    // 响应信息
    private String message;

    ResultCodeEnum(boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }
}
