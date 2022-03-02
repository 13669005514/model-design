package com.supermap.model.design.facade;

/**
 * @author : zhangfx 2022/3/2 16:39
 * @version : 1.0
 */
public class PersonFacade {

    public School school = new School();

    public Home home = new Home();

    public void person(String name) {

        school.study(name);

        home.to(name);
    }




}
