package com.supermap.model.design.observer;

/**
 * @author : zhangfx 2022/3/3 13:53
 * @version : 1.0
 */
public abstract class AbstractMessage {


    abstract void addObserver(AbStractObserver observer);

    abstract void sendMsg();



}
