package com.sunli.sale.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "previous_sale")
public class PreviousSale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Long id;

    /**
     * 前期投资费用名
     */
    private String name;

    /**
     * 前期投资费用
     */
    private BigDecimal money;

    /**
     * 费用支出时间
     */
    @Column(name = "spending_time")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date spendingTime;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 0--固定支出，1--浮动支出
     */
    private Integer type;

    /**
     * 备注
     */
    private String remark;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取前期投资费用名
     *
     * @return name - 前期投资费用名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置前期投资费用名
     *
     * @param name 前期投资费用名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取前期投资费用
     *
     * @return money - 前期投资费用
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 设置前期投资费用
     *
     * @param money 前期投资费用
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * 获取费用支出时间
     *
     * @return spending_time - 费用支出时间
     */
    public Date getSpendingTime() {
        return spendingTime;
    }

    /**
     * 设置费用支出时间
     *
     * @param spendingTime 费用支出时间
     */
    public void setSpendingTime(Date spendingTime) {
        this.spendingTime = spendingTime;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取0--固定支出，1--浮动支出
     *
     * @return type - 0--固定支出，1--浮动支出
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置0--固定支出，1--浮动支出
     *
     * @param type 0--固定支出，1--浮动支出
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}