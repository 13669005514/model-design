package com.supermap.model.design.adapter;

/**
 * 拼音翻译器
 * @author : zhangfx 2022/3/1 16:37
 * @version : 1.0
 */
public class PYTranslator implements Translator {



    @Override
    public String translate(String context) {
        if (context.equals("迪迦")) {
            return "DiJia";
        }
        return null;
    }
}
