package com.sunli.sale.utils.resultUtil;

public enum ResultStatus {
    SUCCESS(0,"成功"),FAIL(1,"失败");
    private Integer code;
    private String desc;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    ResultStatus(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
