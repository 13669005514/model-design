package com.supermap.model.design.state;

/**
 * @author : zhangfx 2022/3/3 10:26
 * @version : 1.0
 */
public interface PersonState {

     void state();

     PersonState next();
}
