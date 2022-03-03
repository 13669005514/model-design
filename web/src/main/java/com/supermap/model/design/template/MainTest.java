package com.supermap.model.design.template;

/**
 * 模板模式
 * @author : zhangfx 2022/3/3 09:45
 * @version : 1.0
 */
public class MainTest {


    public static void main(String[] args) {

        CookAbstract cook = new Egg();

        cook.cooking();

    }


}
