package com.supermap.model.design.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 * @author : zhangfx 2022/3/1 20:19
 * @version : 1.0
 */
public class JdkFruitProxy<T> implements InvocationHandler {

    private T fruit;

    public JdkFruitProxy(T fruit) {
        this.fruit = fruit;
    }


    public static<T> T getProxy(T t) {
        Object o = Proxy.newProxyInstance(t.getClass().getClassLoader(), t.getClass().getInterfaces(), new JdkFruitProxy(t));
        return (T)o;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始代理了");
        Object invoke = method.invoke(fruit, args);
        System.out.println("返回值");
        return invoke;
    }
}
