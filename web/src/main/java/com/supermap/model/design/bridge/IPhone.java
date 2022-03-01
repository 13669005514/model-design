package com.supermap.model.design.bridge;

/**
 * @author : zhangfx 2022/3/1 17:06
 * @version : 1.0
 */
public class IPhone extends  AbstractPhone{


    @Override
    String getPhone() {
        return "Iphone手机 A13处理器" + sale.getSaleInfo();
    }
}
