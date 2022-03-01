package com.supermap.model.design.bridge;

/**
 * 渠道抽象类
 * @author : zhangfx 2022/3/1 17:02
 * @version : 1.0
 */
public abstract class AbstractSale {

    private String type;

    private Integer price;

    public AbstractSale(String type, Integer price) {
        this.type = type;
        this.price = price;
    }

    String getSaleInfo() {
        return "类型："+type+" 价格："+price;
    }
}
