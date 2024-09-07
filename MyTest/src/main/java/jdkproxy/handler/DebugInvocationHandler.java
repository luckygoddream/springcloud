package jdkproxy.handler;

import jdkproxy.service.SmsService;
import jdkproxy.factory.JdkProxyFactory;
import jdkproxy.service.impl.SmsServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK动态代理
 * JDK 动态代理有一个最致命的问题是其只能代理实现了接口的类。
 */
public class DebugInvocationHandler implements InvocationHandler {
    // 代理类中的真实对象
    private final Object target;

    public DebugInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 调用方法前，我们添加自己的操作
        System.out.println("before method:" + method.getName());
        Object result = method.invoke(target, args);
        // 调用方法后，我们添加自己的操作
        System.out.println("after method:" + method.getName());

        return result;
    }


    public static void main(String[] args) {
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("java");

    }
}
