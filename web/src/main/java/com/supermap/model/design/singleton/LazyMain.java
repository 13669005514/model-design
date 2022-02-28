package com.supermap.model.design.singleton;

/**
 * 懒汉式(双重检查锁机制+volatile(解决指令重排序))
 * @author : zhangfx 2022/2/28 16:07
 * @version : 1.0
 */
public class LazyMain {

    private volatile static  LazyMain instance;

    private LazyMain() {
    }

    public static LazyMain getInstance() {
        if (instance == null) {
            synchronized (LazyMain.class) {
                if (instance == null) {
                    instance = new LazyMain();
                    return instance;
                }
            }
        }
        return instance;
    }


    public static void main(String[] args) {
        System.out.println(LazyMain.getInstance() == LazyMain.getInstance());
    }


}
