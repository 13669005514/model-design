package com.supermap.model.design.builder;

/**
 * @author : zhangfx 2022/3/1 15:17
 * @version : 1.0
 */
public class TestBuilder {

    public static void main(String[] args) {

        AbstractBuilder abstractBuilder = new XiaoMiPhoneBuilder();
        Phone p = abstractBuilder.cpu("骁龙8个8").memory(128).getPhone();
        System.out.println(p);
    }

}
