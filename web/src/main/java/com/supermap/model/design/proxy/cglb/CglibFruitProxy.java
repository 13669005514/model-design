package com.supermap.model.design.proxy.cglb;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 * @author : zhangfx 2022/3/1 20:19
 * @version : 1.0
 */
public class CglibFruitProxy<T>  {

    private T fruit;

    public CglibFruitProxy(T fruit) {
        this.fruit = fruit;
    }


    public static<T> T getProxy(T t) {
        //1.创建一个增强器
        Enhancer enhancer = new Enhancer();
        //2.设置要增强哪个类的功能
        enhancer.setSuperclass(t.getClass());
        //3.设置回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("开始代理了");
                //目标方法执行
                Object o1 = methodProxy.invokeSuper(o, objects);
                System.out.println("返回值");
                return o1;
            }
        });
        Object o = enhancer.create();
        return (T)o;
    }
}
