package com.supermap.model.design.intermediary;

/**
 * @author : zhangfx 2022/3/3 10:54
 * @version : 1.0
 */
public class ControlTower {


    private boolean agree = true;

    public boolean instruct(Aircraft aircraft,String status) {
        if (status.equals("success")) {
            System.out.println("收到");
            agree = true;
        } else{
            if (agree) {
                agree = false;
                System.out.println("允许");
            } else {
                System.out.println("不允许");
            }
        }
        return agree;
    }



}
