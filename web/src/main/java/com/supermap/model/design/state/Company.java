package com.supermap.model.design.state;

/**
 * @author : zhangfx 2022/3/3 10:30
 * @version : 1.0
 */
public class Company {

    private PersonState personState;

    public Company(PersonState personState) {
        this.personState = personState;
    }

    public void work() {
        this.personState.state();
    }

    public void next() {
        this.personState = this.personState.next();
    }


}
