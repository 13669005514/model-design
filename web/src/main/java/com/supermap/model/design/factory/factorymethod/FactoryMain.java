package com.supermap.model.design.factory.factorymethod;

/**
 * 抽象工厂模式
 * @author : zhangfx 2022/2/28 17:21
 * @version : 1.0
 */
public class FactoryMain {


    public static void main(String[] args) {
        //创建suv
        CarFactoryAbstract carFactoryAbstract = new MpvCarFactory();
        carFactoryAbstract.crateCar().run();
        carFactoryAbstract =  new SuvCarFactory();
        carFactoryAbstract.crateCar().run();
    }
}
