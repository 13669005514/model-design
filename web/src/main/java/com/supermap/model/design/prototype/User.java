package com.supermap.model.design.prototype;

import lombok.Data;

/**
 * @author : zhangfx 2022/2/28 09:36
 * @version : 1.0
 */
@Data
public class User implements Cloneable {

    private String name;

    private Integer age;

    @Override
    protected User clone() throws CloneNotSupportedException {
        User user = new User();
        user.setName(this.getName());
        user.setAge(this.getAge());
        return user;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
