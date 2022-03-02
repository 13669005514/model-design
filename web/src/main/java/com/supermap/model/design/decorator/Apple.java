package com.supermap.model.design.decorator;

/**
 * @author : zhangfx 2022/3/1 20:09
 * @version : 1.0
 */
public class Apple implements Fruit {


    @Override
    public String create() {
        System.out.println("创建了一个苹果");
        return "apple";
    }
}
