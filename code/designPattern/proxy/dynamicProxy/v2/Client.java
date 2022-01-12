package designPattern.proxy.dynamicProxy.v2;


import designPattern.proxy.dynamicProxy.Payable;

import java.util.Comparator;

/**
 * @author 蝉沐风
 * @description 调用客户端
 * @date 2022/1/10
 */
public class Client {
    public static void main(String[] args) {
        Payable payable = (Payable) Proxy.newProxyInstance(new MyClassLoader(), Comparator.class);
        payable.pay();
    }
}


