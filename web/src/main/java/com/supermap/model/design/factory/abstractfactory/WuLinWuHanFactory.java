package com.supermap.model.design.factory.abstractfactory;

/**
 * @author : zhangfx 2022/3/1 14:44
 * @version : 1.0
 */
public class WuLinWuHanFactory extends WulinCarFactory{


    @Override
    CarAbstract createCar() {
        return new SuvCar();
    }



}
