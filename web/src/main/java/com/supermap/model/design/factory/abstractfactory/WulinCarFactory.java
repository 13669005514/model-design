package com.supermap.model.design.factory.abstractfactory;

/**
 * @author : zhangfx 2022/3/1 14:40
 * @version : 1.0
 */
public abstract  class WulinCarFactory extends  WulinFactory{

    @Override
    MaskAbstract cerateMask() {
        return null;
    }

    abstract CarAbstract createCar();
}
