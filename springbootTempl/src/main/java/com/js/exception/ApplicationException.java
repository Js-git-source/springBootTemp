package com.js.exception;

/**
 * Created by j1076 on 2020/3/16.
 */
public class ApplicationException extends RuntimeException {
    public ApplicationException(){

    }
    public ApplicationException(String msg){
        super(msg);
    }

    public ApplicationException(String msg,Throwable t){
        super(msg,t);
    }
}
