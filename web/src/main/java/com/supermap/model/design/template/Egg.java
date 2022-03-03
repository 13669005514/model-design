package com.supermap.model.design.template;

/**
 * @author : zhangfx 2022/3/3 09:44
 * @version : 1.0
 */
public class Egg extends CookAbstract{


    @Override
    void buy() {
        System.out.println("买了三个鸡蛋");
    }

    @Override
    void fry() {
        System.out.println("煎2分钟");
    }
}
