package com.supermap.model.design.factory.abstractfactory;

/**
 * @author : zhangfx 2022/3/1 14:46
 * @version : 1.0
 */

public class KnMask extends MaskAbstract{
    @Override
    void create() {
        System.out.println("创造好一个n95口罩");
    }
}
