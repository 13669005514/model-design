package com.supermap.model.design.state;



/**
 * 状态模式
 * @author : zhangfx 2022/3/3 09:45
 * @version : 1.0
 */
public class MainTest {


    public static void main(String[] args) {

        Company company = new Company(new EatImpl());

        company.work();
        company.next();
        company.work();
        company.next();
        company.work();


    }


}
