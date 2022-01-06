package designPattern.proxy.staticProxy.usingInterface;


import designPattern.proxy.staticProxy.Payable;
import designPattern.proxy.staticProxy.SiShiDaDao;
import designPattern.proxy.staticProxy.usingExtends.SiShiDaDaoLogTimeProxy;

/**
 * @author chanmufeng
 * @description 调用客户端
 * @date 2022/1/6
 */
public class Client {
    public static void main(String[] args) {
        //先打印日志，再计算时间
//        Payable proxy = new SiShiDaDaoLogProxy(new SiShiDaDaoTimeProxy(new SiShiDaDao()));
//        proxy.pay();

        //先计算时间，再打印日志
        Payable proxy = new SiShiDaDaoTimeProxy(new SiShiDaDaoLogProxy(new SiShiDaDao()));
        proxy.pay();
    }
}


