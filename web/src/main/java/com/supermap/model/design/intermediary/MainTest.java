package com.supermap.model.design.intermediary;

/**
 * 中介者模式
 * @author : zhangfx 2022/3/3 11:02
 * @version : 1.0
 */
public class MainTest {


    public static void main(String[] args) {

        ControlTower controlTower = new ControlTower();

        Aircraft whfly = new WhFly(controlTower);

        Aircraft hzfly = new HzFly(controlTower);
        whfly.fly();
        whfly.success();
        hzfly.fly();
        whfly.load();
        hzfly.success();
        hzfly.load();
    }


}
