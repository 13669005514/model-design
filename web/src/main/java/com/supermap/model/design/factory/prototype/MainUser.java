package com.supermap.model.design.factory.prototype;


import java.util.HashMap;
import java.util.Map;

/**
 * 原型模式
 * @author : zhangfx 2022/2/28 09:38
 * @version : 1.0
 */
public class MainUser {

    private static Map<String,User> mapCache = new HashMap<>();

    public static User getUser(String userName) throws CloneNotSupportedException {
        User user = null;
        if (mapCache.containsKey(userName)) {
            user = mapCache.get(userName).clone();
        } else {
            user = new User();
            user.setName(userName);
            user.setAge(18);
            mapCache.put(userName,user);
            user = user.clone();
        }
        return user;
    }



    public static void main(String[] args) throws CloneNotSupportedException {
        User user1 = MainUser.getUser("张三");
        user1.setName("李四");
        System.out.println(user1.toString());
        User user2= MainUser.getUser("张三");
        user2.setAge(16);
        System.out.println(user2.toString());
        User user3 = MainUser.getUser("张三");
        System.out.println(user3.toString());
    }

}
