package com.supermap.model.design.adapter;

/**
 * 电影播放器
 * @author : zhangfx 2022/3/1 16:34
 * @version : 1.0
 */
public class MoviePlayer implements Player{


    @Override
    public String play() {
        System.out.println("开始播放电影：奥特曼");
        String  one = "迪迦";
        System.out.println(one);
        return one;
    }
}
