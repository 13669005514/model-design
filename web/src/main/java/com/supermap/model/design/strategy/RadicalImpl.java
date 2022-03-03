package com.supermap.model.design.strategy;

/**
 * @author : zhangfx 2022/3/3 09:53
 * @version : 1.0
 */
public class RadicalImpl implements GamePlan{

    @Override
    public void plan() {
        System.out.println("只管乱杀");
    }
}
