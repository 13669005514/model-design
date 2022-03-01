package com.supermap.model.design.factory.abstractfactory;

/**
 * @author : zhangfx 2022/3/1 14:47
 * @version : 1.0
 */
public class Test {

    public static void main(String[] args) {

        WulinFactory wulinFactory = new WuLinWuHanFactory();

        wulinFactory.createCar().run();

        wulinFactory = new WuLinHzFactory();

        wulinFactory.cerateMask().create();


    }

}
