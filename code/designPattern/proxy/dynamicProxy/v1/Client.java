package designPattern.proxy.dynamicProxy.v1;


import designPattern.proxy.staticProxy.Payable;

/**
 * @author chanmufeng
 * @description 调用客户端
 * @date 2022/1/6
 */
public class Client {
    public static void main(String[] args) {
        Payable payable = (Payable) Proxy.newProxyInstance(new MyClassLoader());
        payable.pay();
    }
}


