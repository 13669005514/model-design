package com.supermap.model.design.factory.simple;

/**
 * 简单工厂模式
 * @author : zhangfx 2022/2/28 14:41
 * @version : 1.0
 */
public class SimpleMain {

    public static void main(String[] args) {
        CarAbstract suv = SimpleFactory.createCar("suv");
        suv.run();
        CarAbstract mpv = SimpleFactory.createCar("mpv");
        mpv.run();
    }

}
