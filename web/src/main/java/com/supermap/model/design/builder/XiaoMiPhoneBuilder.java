package com.supermap.model.design.builder;

/**
 * @author : zhangfx 2022/3/1 15:16
 * @version : 1.0
 */
public class XiaoMiPhoneBuilder extends AbstractBuilder{


    public XiaoMiPhoneBuilder() {
        this.phone = new Phone();
    }

    @Override
    AbstractBuilder cpu(String cpuName) {
        this.phone.setCpu(cpuName);
        return this;
    }

    @Override
    AbstractBuilder memory(Integer memory) {
        this.phone.setMemory(memory);
        return this;
    }
}
