package com.supermap.model.design.adapter.obj;

import com.supermap.model.design.adapter.MoviePlayer;
import com.supermap.model.design.adapter.PYTranslator;
import com.supermap.model.design.adapter.Player;

/**
 * 适配器
 * @author : zhangfx 2022/3/1 16:39
 * @version : 1.0
 */
public class MovieAdapter  implements Player {

    private PYTranslator pyTranslator;

    private MoviePlayer moviePlayer;

    public MovieAdapter(MoviePlayer moviePlayer,PYTranslator pyTranslator) {
        this.moviePlayer = moviePlayer;
        this.pyTranslator = pyTranslator;
    }

    @Override
    public String play() {
        String play = moviePlayer.play();
        //适配器转换
        String translate = this.pyTranslator.translate(play);
        System.out.println(translate);
        return translate;
    }
}
