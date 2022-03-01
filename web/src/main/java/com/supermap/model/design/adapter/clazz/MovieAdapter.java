package com.supermap.model.design.adapter.clazz;

import com.supermap.model.design.adapter.MoviePlayer;
import com.supermap.model.design.adapter.PYTranslator;
import com.supermap.model.design.adapter.Player;

/**
 * 适配器
 * @author : zhangfx 2022/3/1 16:39
 * @version : 1.0
 */
public class MovieAdapter extends PYTranslator implements Player {

    private MoviePlayer moviePlayer;

    public MovieAdapter(MoviePlayer moviePlayer) {
        this.moviePlayer = moviePlayer;
    }

    @Override
    public String play() {
        String play = moviePlayer.play();
        //适配器转换
        String translate = this.translate(play);
        System.out.println(translate);
        return translate;
    }
}
