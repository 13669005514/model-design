package com.supermap.model.design.proxy.statics;

/**
 * @author : zhangfx 2022/3/1 20:19
 * @version : 1.0
 */
public class AppleProxy implements Fruit {

    private Fruit fruit;

    public AppleProxy(Fruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public String create() {
        System.out.println("苹果装入礼盒");
        String s = fruit.create();
        return s;
    }
}
