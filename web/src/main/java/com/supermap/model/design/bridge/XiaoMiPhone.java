package com.supermap.model.design.bridge;

/**
 * @author : zhangfx 2022/3/1 17:06
 * @version : 1.0
 */
public class XiaoMiPhone extends  AbstractPhone{

    @Override
    String getPhone() {
        return "小米手机 888处理器" + sale.getSaleInfo();
    }
}
