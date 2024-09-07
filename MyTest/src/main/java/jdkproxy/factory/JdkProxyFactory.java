package jdkproxy.factory;

import jdkproxy.handler.DebugInvocationHandler;

import java.lang.reflect.Proxy;

public class JdkProxyFactory {
    public static Object getProxy(Object target){

        return Proxy.newProxyInstance(target.getClass().getClassLoader(), // 目标类的类加载器
                target.getClass().getInterfaces(), // 代理要实现的接口，可以多个
                new DebugInvocationHandler(target)); // 代理对象的自定义InvocationHandler
    }
}
