package com.supermap.model.design.bridge;


/**
 * @author : zhangfx 2022/3/1 17:12
 * @version : 1.0
 */
public class MainTest {

    public static void main(String[] args) {

        AbstractPhone phone = new IPhone();

        phone.setSale(new OnlineSale("线上",6663));

        System.out.println(phone.getPhone());


        phone.setSale(new OfflineSale("线下",7888));

        System.out.println(phone.getPhone());

    }


}
