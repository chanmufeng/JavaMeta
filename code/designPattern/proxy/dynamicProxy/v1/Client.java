package designPattern.proxy.dynamicProxy.v1;


import designPattern.proxy.dynamicProxy.Payable;

/**
 * @author 蝉沐风
 * @description 调用客户端
 * @date 2022/1/10
 */
public class Client {
    public static void main(String[] args) {
        Payable payable = (Payable) Proxy.newProxyInstance(new MyClassLoader());
        payable.pay();
    }
}


