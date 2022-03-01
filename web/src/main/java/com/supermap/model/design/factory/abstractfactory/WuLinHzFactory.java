package com.supermap.model.design.factory.abstractfactory;

/**
 * @author : zhangfx 2022/3/1 14:44
 * @version : 1.0
 */
public class WuLinHzFactory extends WulinMaskFactory{

    @Override
    MaskAbstract cerateMask() {
        return new KnMask();
    }


}
