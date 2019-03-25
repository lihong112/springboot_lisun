package com.sunli.sale.dto.reqDTO;

import java.math.BigDecimal;
import java.util.Date;

public class PreviousSaleSelectListDTO {
    //费用支出时间范围
    private Date spendingTime1;
    private Date spendingTime2;
    //费用名
    private String name;
    //费用支出范围
    private BigDecimal money1;
    private BigDecimal money2;
    //费用类型：0--固定支出，1--浮动支出
    private Integer type;
    private Integer pageNum;
    private Integer pageSize;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Date getSpendingTime1() {
        return spendingTime1;
    }

    public void setSpendingTime1(Date spendingTime1) {
        this.spendingTime1 = spendingTime1;
    }

    public Date getSpendingTime2() {
        return spendingTime2;
    }

    public void setSpendingTime2(Date spendingTime2) {
        this.spendingTime2 = spendingTime2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMoney1() {
        return money1;
    }

    public void setMoney1(BigDecimal money1) {
        this.money1 = money1;
    }

    public BigDecimal getMoney2() {
        return money2;
    }

    public void setMoney2(BigDecimal money2) {
        this.money2 = money2;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
