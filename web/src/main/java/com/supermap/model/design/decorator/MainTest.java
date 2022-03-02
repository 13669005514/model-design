package com.supermap.model.design.decorator;

/**
 * 装饰器实现
 * @author : zhangfx 2022/3/1 20:20
 * @version : 1.0
 */
public class MainTest {

    public static void main(String[] args) {

        Fruit fruit = new Apple();

        FruitDecorator fruitDecorator = new AppleDecoratorImpl(fruit);

        fruitDecorator.create();

    }

}
