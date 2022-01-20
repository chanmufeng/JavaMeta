package designPattern.proxy.dynamicProxy.jdk;


import designPattern.proxy.dynamicProxy.Payable;
import designPattern.proxy.dynamicProxy.SiShiDaDao;
import designPattern.proxy.dynamicProxy.v4.MyClassLoader;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author 蝉沐风
 * @description 调用客户端
 * @date 2022/1/10
 */
public class Client {
    public static void main(String[] args) {
        // 创建被代理对象
        SiShiDaDao target = new SiShiDaDao();

        // 实现自己的逻辑
        InvocationHandler logHandler = new LogInvocationHandler(target);

        // 得到代理对象
        Class[] classes = new Class[1];
        classes[0] = Payable.class;
        Payable proxy = (Payable) Proxy.newProxyInstance(new MyClassLoader(), classes, logHandler);

        // 调用代理对象目标方法
        proxy.pay();
    }
}


