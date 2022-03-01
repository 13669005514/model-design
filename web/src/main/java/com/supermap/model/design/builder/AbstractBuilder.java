package com.supermap.model.design.builder;

/**
 * @author : zhangfx 2022/3/1 15:13
 * @version : 1.0
 */
public abstract class AbstractBuilder {

    protected Phone phone;

    abstract AbstractBuilder cpu(String cpuName);

    abstract AbstractBuilder memory(Integer memory);

    public Phone getPhone() {
        return phone;
    }
}
