package com.js.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by j1076 on 2020/3/16.
 */
@ControllerAdvice
public class MyControllerException  {
    @ResponseBody
    @ExceptionHandler(value = java.lang.Exception.class)
    public Map<String,Object> myException(Exception e){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code",500);
        map.put("msg","出错了");
        return map;
    }

    @ResponseBody
    @ExceptionHandler(value = java.lang.NullPointerException.class)
    public Map<String,Object> nullPointerException(Exception e){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code",501);
        map.put("msg","空指针异常");
        return map;
    }

    @ResponseBody
    @ExceptionHandler(value = com.js.exception.ApplicationException.class)
    public Map<String,Object> myDefineException(Exception e){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code",502);
        map.put("msg","自定义异常");
        return map;
    }
}
