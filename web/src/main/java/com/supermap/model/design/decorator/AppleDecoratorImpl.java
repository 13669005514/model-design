package com.supermap.model.design.decorator;

/**
 * @author : zhangfx 2022/3/1 20:19
 * @version : 1.0
 */
public class AppleDecoratorImpl implements FruitDecorator{

    private Fruit fruit;

    public AppleDecoratorImpl(Fruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public String create() {
        String s = fruit.create();
        enable();
        return s;
    }

    @Override
    public void enable() {
        System.out.println("苹果装入礼盒");
    }
}
