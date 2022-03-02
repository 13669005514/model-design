package com.supermap.model.design.proxy.dynamic;


/**
 * jdk动态代理
 * @author : zhangfx 2022/3/1 20:20
 * @version : 1.0
 */
public class MainTest {

    public static void main(String[] args) {

        Fruit fruit = new Apple();

        Fruit proxy = JdkFruitProxy.getProxy(fruit);
        proxy.create();

    }

}
