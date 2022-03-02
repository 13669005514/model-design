package com.supermap.model.design.flyweight;

import lombok.Data;

/**
 * @author : zhangfx 2022/3/2 17:32
 * @version : 1.0
 */
@Data
public class Waiter extends AbstractWaiter{

    private String id;

    private String name;

    public Waiter(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    void start() {

        System.out.println(id+":"+name+"开始服务");

        canService= false;

    }

    @Override
    void end() {
        System.out.println(id+":"+name+"结束服务");

        canService= true;

    }
}
