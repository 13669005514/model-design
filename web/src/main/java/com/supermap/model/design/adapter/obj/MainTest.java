package com.supermap.model.design.adapter.obj;

import com.supermap.model.design.adapter.MoviePlayer;
import com.supermap.model.design.adapter.PYTranslator;
import com.supermap.model.design.adapter.obj.MovieAdapter;

/**
 * 对象组合方式适配器
 * @author : zhangfx 2022/3/1 16:41
 * @version : 1.0
 */
public class MainTest {


    public static void main(String[] args) {
        MovieAdapter movieAdapter = new MovieAdapter(new MoviePlayer(),new PYTranslator());
        movieAdapter.play();

    }

}
