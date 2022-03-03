package com.supermap.model.design.observer;


/**
 * 观察者模式
 * @author : zhangfx 2022/3/3 11:02
 * @version : 1.0
 */
public class MainTest {


    public static void main(String[] args) {
        AbstractMessage a = new A();

        AbStractObserver b = new B();

        a.sendMsg();
        a.addObserver(b);
        a.sendMsg();

    }


}
