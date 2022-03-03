package com.supermap.model.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangfx 2022/3/3 13:54
 * @version : 1.0
 */
public class A extends AbstractMessage{

    List<AbStractObserver> users = new ArrayList<>();


    @Override
    void addObserver(AbStractObserver observer) {
        users.add(observer);
    }

    @Override
    void sendMsg() {
        System.out.println("开始发送消息");
        for (AbStractObserver user : users) {
            user.getMessage("快去做核酸");
        }
    }
}
