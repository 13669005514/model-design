package com.supermap.model.design.proxy.cglb;




/**
 * Cglib动态代理 不需要接口也可以代理
 * @author : zhangfx 2022/3/1 20:20
 * @version : 1.0
 */
public class MainTest {

    public static void main(String[] args) {

        Apple fruit = new Apple();

        Apple proxy = CglibFruitProxy.getProxy(fruit);

        proxy.create();

    }

}
