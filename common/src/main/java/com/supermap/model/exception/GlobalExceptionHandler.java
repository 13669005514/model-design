package com.supermap.model.exception;


import cn.hutool.core.exceptions.ExceptionUtil;
import com.supermap.model.config.ResultCodeEnum;

import com.supermap.model.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataAccessException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintViolationException;
import java.io.FileNotFoundException;
import java.net.ConnectException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhangfx 2020/1/15 18:01
 * @version : 1.0
 */

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


    /**-------- 通用异常处理方法 --------**/
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e) {
        log.error("未知异常:{}",ExceptionUtil.stacktraceToString(e));
        e.printStackTrace();
        return R.setResult(ResultCodeEnum.UNKNOWN_ERROR).data(e.getMessage());
    }

    /**-------- 空指针 --------**/
    @ExceptionHandler({NullPointerException.class})
    @ResponseBody
    public R error(NullPointerException e) {
        log.error("空指针异常:{}",ExceptionUtil.stacktraceToString(e));
        return R.setResult(ResultCodeEnum.NULL_POINT).data("info",e.getMessage());
    }

    /**
     * spring validator 方法参数验证异常拦截
     * @param e 绑定验证异常
     * @return 错误返回消息
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public R defaultErrorHandler(MethodArgumentNotValidException e) {
        BindingResult validResult = e.getBindingResult();
        Map<String,Object> messages = new HashMap<>();
        for (ObjectError error : validResult.getAllErrors()) {
            FieldError fieldError = (FieldError) error;
            messages.put(fieldError.getField(), fieldError.getDefaultMessage());
        }
        log.error("参数校验异常:{}",messages.toString());
        return R.setResult(ResultCodeEnum.PARAM_ERROR).data("info",messages);
    }

    /**
     * spring validator 方法参数验证异常拦截
     * @param e 绑定验证异常
     * @return 错误返回消息
     */
    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseBody
    public R defaultErrorHandler(ConstraintViolationException e) {
        log.error("参数校验异常:{}",e.getMessage());
        String[] msgs = e.getMessage().split(": ");
        return R.setResult(ResultCodeEnum.PARAM_ERROR).data("info",msgs[msgs.length-1]);
    }


    /**-------- 操作数据库异常 --------**/
    @ExceptionHandler({DataAccessException.class})
    @ResponseBody
    public R error(DataAccessException e) {
        log.error("操作数据库异常:{}",ExceptionUtil.stacktraceToString(e));
        return R.setResult(ResultCodeEnum.SQL_ERROR);
    }



    /**-------- 文件未找到 --------**/
    @ExceptionHandler({FileNotFoundException.class})
    @ResponseBody
    public R error(FileNotFoundException e) {
        log.error("文件未找到异常:{}",ExceptionUtil.stacktraceToString(e));
        return R.setResult(ResultCodeEnum.FILE_ERROR).data(e.getMessage());
    }



    /**-------- 数组越界异常 --------**/
    @ExceptionHandler({ArrayIndexOutOfBoundsException.class})
    @ResponseBody
    public R error(ArrayIndexOutOfBoundsException e) {
        log.error("数组越界异常:{}",ExceptionUtil.stacktraceToString(e));
        return R.setResult(ResultCodeEnum.ARRAY_INDEX_OUT_ERROR).data(e.getMessage());
    }

    /**-------- 请求连接超时异常 --------**/
    @ExceptionHandler({ConnectException.class})
    @ResponseBody
    public R error(ConnectException e) {
        log.error("请求连接超时异常:{}",e.getMessage());
        return R.setResult(ResultCodeEnum.CONNECT_ERROR).data(e.getMessage());
    }


    /**-------- 请求方式错误 --------**/
    @ExceptionHandler({HttpRequestMethodNotSupportedException.class})
    @ResponseBody
    public R error(HttpRequestMethodNotSupportedException e) {
        log.error("HTTP请求方式错误:{}",e.getMessage());
        return R.setResult(ResultCodeEnum.NOT_SUPPORT_ERROR).data(e.getMessage());
    }

    /**-------- 请求方式错误 --------**/
    @ExceptionHandler({MissingServletRequestParameterException.class})
    @ResponseBody
    public R error(MissingServletRequestParameterException e) {
        log.error("请求参数不存在:{}",e.getMessage());
        return R.setResult(ResultCodeEnum.PARAM_ERROR).data(e.getMessage());
    }


}
