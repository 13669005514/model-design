package com.supermap.model.design.bridge;

/**
 * 手机销售抽象类
 * @author : zhangfx 2022/3/1 17:01
 * @version : 1.0
 */
public abstract class AbstractPhone {

     //桥接渠道
     AbstractSale sale;

     //获取手机描述
     abstract String getPhone();

     public void setSale(AbstractSale sale) {
        this.sale = sale;
     }
}
