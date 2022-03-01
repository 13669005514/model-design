package com.supermap.model.design.factory.abstractfactory;

/**
 * @author : zhangfx 2022/3/1 14:40
 * @version : 1.0
 */
public abstract class WulinMaskFactory extends  WulinFactory{

    abstract MaskAbstract cerateMask();

    @Override
    CarAbstract createCar() {
        return null;
    }
}
