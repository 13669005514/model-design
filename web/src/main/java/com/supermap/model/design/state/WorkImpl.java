package com.supermap.model.design.state;

/**
 * @author : zhangfx 2022/3/3 10:28
 * @version : 1.0
 */
public class WorkImpl implements PersonState{


    @Override
    public void state() {
        System.out.println("我在工作 卷 卷 卷 ");
    }

    @Override
    public PersonState next() {
        return new EatImpl();
    }
}
