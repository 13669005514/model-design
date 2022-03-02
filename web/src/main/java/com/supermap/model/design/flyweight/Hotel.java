package com.supermap.model.design.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 饭店
 * @author : zhangfx 2022/3/2 17:37
 * @version : 1.0
 */
public class Hotel {

    private static Map<String,AbstractWaiter> pools = new HashMap<>();

    static {

        pools.put("001",new Waiter("001","张三"));

        pools.put("002",new Waiter("002","李四"));
    }

    public static AbstractWaiter getWaiter() {
        for (AbstractWaiter value : pools.values()) {
            if (value.isCanService()) {
                return value;
            }
        }
        return null;
    }

}
