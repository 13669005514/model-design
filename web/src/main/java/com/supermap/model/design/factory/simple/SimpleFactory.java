package com.supermap.model.design.factory.simple;

import cn.hutool.core.util.StrUtil;

/**
 * @author : zhangfx 2022/2/28 17:12
 * @version : 1.0
 */
public class SimpleFactory {

    public static CarAbstract createCar(String type) {
        CarAbstract car = null;
        if (StrUtil.equals("suv", type)) {
            car = new SuvCar();
        }
        if (StrUtil.equals("mpv", type)) {
            car= new  MpvCar();
        }
        return car;
    }


}
