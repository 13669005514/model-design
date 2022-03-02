package com.supermap.model.design.flyweight;

/**
 * @author : zhangfx 2022/3/2 17:30
 * @version : 1.0
 */
public abstract class AbstractWaiter {


    boolean canService = true;

    /**
     * 开始服务
     */
    abstract void start();

    /**
     * 结束服务
     */
    abstract void end();

    public boolean isCanService() {
        return canService;
    }
}
