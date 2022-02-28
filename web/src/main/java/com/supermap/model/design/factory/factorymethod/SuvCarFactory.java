package com.supermap.model.design.factory.factorymethod;

/**
 * SUV创建工厂
 * @author : zhangfx 2022/2/28 17:19
 * @version : 1.0
 */
public class SuvCarFactory extends CarFactoryAbstract{

    @Override
    public  CarAbstract crateCar() {
        return new SuvCar();
    }


}
