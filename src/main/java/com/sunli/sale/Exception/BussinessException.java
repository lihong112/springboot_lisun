package com.sunli.sale.Exception;

public class BussinessException extends RuntimeException {
    private String code;  //异常状态码
    private String message;  //异常信息

    public BussinessException(String code,String message){
        this.code=code;
        this.message=message;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
