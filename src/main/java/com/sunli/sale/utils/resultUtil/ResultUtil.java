package com.sunli.sale.utils.resultUtil;

public class ResultUtil {
    public static ResultMsg success(Object data){
        ResultMsg<Object> objectResultMsg = new ResultMsg<>();
        objectResultMsg.setCode(ResultStatus.SUCCESS.getCode());
        objectResultMsg.setMsg(ResultStatus.SUCCESS.getDesc());
        objectResultMsg.setData(data);
        return objectResultMsg;
    }

    public static ResultMsg fail(){
        ResultMsg<Object> objectResultMsg = new ResultMsg<>();
        objectResultMsg.setCode(ResultStatus.FAIL.getCode());
        objectResultMsg.setMsg(ResultStatus.FAIL.getDesc());
        return objectResultMsg;
    }

    public static ResultMsg normal(Integer code,String msg){
        ResultMsg<Object> objectResultMsg = new ResultMsg<>();
        objectResultMsg.setCode(code);
        objectResultMsg.setMsg(msg);
        return objectResultMsg;
    }

    public static ResultMsg normalData(Integer code,String msg,Object data){
        ResultMsg<Object> objectResultMsg = new ResultMsg<>();
        objectResultMsg.setCode(code);
        objectResultMsg.setMsg(msg);
        objectResultMsg.setData(data);
        return objectResultMsg;
    }
}
