package com.supermap.model.design.strategy;

/**
 * 策略模式
 * @author : zhangfx 2022/3/3 09:56
 * @version : 1.0
 */
public class MainTest {


    public static void main(String[] args) {

        GamePlayer gamePlayer = new GamePlayer(new RadicalImpl());
        gamePlayer.startGame();


    }

}
