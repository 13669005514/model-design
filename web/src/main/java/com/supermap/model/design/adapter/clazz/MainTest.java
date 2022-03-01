package com.supermap.model.design.adapter.clazz;

import com.supermap.model.design.adapter.MoviePlayer;

/**
 * ；类结构继承方式适配器
 * @author : zhangfx 2022/3/1 16:41
 * @version : 1.0
 */
public class MainTest {


    public static void main(String[] args) {
        MovieAdapter movieAdapter = new MovieAdapter(new MoviePlayer());
        movieAdapter.play();

    }

}
