package com.supermap.model.design.singleton;

/**
 * 饿汉式
 * @author : zhangfx 2022/2/28 16:04
 * @version : 1.0
 */
public class HungryMain {

    private static final HungryMain instance = new HungryMain();

    private HungryMain() {
    }

    public static HungryMain getInstance() {
       return instance;
    }

    public static void main(String[] args) {
        System.out.println(HungryMain.getInstance()  == HungryMain.getInstance());
    }

}
