package com.supermap.model.design.intermediary;

/**
 * @author : zhangfx 2022/3/3 10:52
 * @version : 1.0
 */
public class WhFly implements Aircraft{


    private ControlTower controlTower;

    public WhFly(ControlTower controlTower) {
        this.controlTower = controlTower;
    }

    @Override
    public void fly() {
        System.out.println("请求塔台 武汉C919请求起飞");
        controlTower.instruct(this,"fly");

    }

    @Override
    public void load() {
        System.out.println("请求塔台 武汉C919请求降落");
        controlTower.instruct(this,"load");
    }

    @Override
    public void success() {
        System.out.println("塔台 武汉C919已完成");
        controlTower.instruct(this,"success");
    }
}
