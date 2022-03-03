package com.supermap.model.design.flyweight;



/**
 * 享元模式实现
 * @author : zhangfx 2022/3/1 20:20
 * @version : 1.0
 */
public class MainTest {

    public static void main(String[] args) {

        AbstractWaiter waiter = Hotel.getWaiter();
        waiter.start();
        AbstractWaiter waiter2 = Hotel.getWaiter();
        waiter2.start();
        AbstractWaiter waiter3 = Hotel.getWaiter();
        System.out.println(waiter3);
        waiter2.end();
        AbstractWaiter waiter4 = Hotel.getWaiter();
        waiter4.start();


    }

}
