package com.supermap.model.design.facade;



/**
 * 门面模式实现
 * @author : zhangfx 2022/3/1 20:20
 * @version : 1.0
 */
public class MainTest {

    public static void main(String[] args) {

        PersonFacade personFacade = new PersonFacade();

        personFacade.person("张三");

    }

}
