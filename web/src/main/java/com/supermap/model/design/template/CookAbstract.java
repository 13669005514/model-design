package com.supermap.model.design.template;

/**
 * 做饭的抽象
 * @author : zhangfx 2022/3/3 09:40
 * @version : 1.0
 */
public abstract class CookAbstract {

    void cooking() {
        buy();
        salt();
        fry();
        complete();
    }

    abstract void buy();

    void salt(){
         System.out.println("开始加盐....");
    }

    abstract void fry();

    void complete(){
        System.out.println("做好了");
    }



}
