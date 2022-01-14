package designPattern.proxy.staticProxy.usingInterface;


import designPattern.proxy.staticProxy.Payable;

/**
 * @author 蝉沐风
 * @description 「四十大盗」金融公司日志代理
 * @date 2022/1/6
 */
public class SiShiDaDaoLogProxy implements Payable {

    //被代理对象
    private Payable payable;

    public SiShiDaDaoLogProxy(Payable payable) {
        this.payable = payable;
    }


    @Override
    public void pay() {
        System.out.println("打印日志1");

        payable.pay();

        System.out.println("打印日志2");
    }
}
