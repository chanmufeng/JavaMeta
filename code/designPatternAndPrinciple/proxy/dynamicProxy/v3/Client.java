package designPatternAndPrinciple.proxy.dynamicProxy.v3;


import designPatternAndPrinciple.proxy.dynamicProxy.Payable;
import designPatternAndPrinciple.proxy.dynamicProxy.SiShiDaDao;

/**
 * @author 蝉沐风
 * @description 调用客户端
 * @date 2022/1/14
 */
public class Client {
    public static void main(String[] args) {

        // 创建被代理对象
        SiShiDaDao target = new SiShiDaDao();

        // 实现自己的逻辑
        InvocationHandler logHandler = new LogInvocationHandler(target);

        // 得到代理对象
        Payable proxy = (Payable) Proxy.newProxyInstance(new MyClassLoader(), Payable.class, logHandler);

        // 调用代理对象目标方法
        proxy.pay();
    }
}


