package designPattern.proxy.dynamicProxy.v3;


import designPattern.proxy.dynamicProxy.Payable;
import designPattern.proxy.dynamicProxy.SiShiDaDao;

/**
 * @author 蝉沐风
 * @description 调用客户端
 * @date 2022/1/14
 */
public class Client {
    public static void main(String[] args) {
        //创建被代理对象
        SiShiDaDao target = new SiShiDaDao();

        InvocationHandler logHandler = new LogInvocationHandler(target);


        Payable payable = (Payable) Proxy.newProxyInstance(new MyClassLoader(), Payable.class, logHandler);
        payable.pay();
    }
}


