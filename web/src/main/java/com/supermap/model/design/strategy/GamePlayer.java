package com.supermap.model.design.strategy;

/**
 * 玩家
 * @author : zhangfx 2022/3/3 09:54
 * @version : 1.0
 */
public class GamePlayer {

    private GamePlan gamePlan;


    public GamePlayer(GamePlan gamePlan) {
        this.gamePlan = gamePlan;
    }

    public void startGame() {
        System.out.println("开始玩游戏");
        gamePlan.plan();
        System.out.println("游戏结束");


    }



}
