package designPattern.proxy.staticProxy.usingInterface;


import designPattern.proxy.staticProxy.Payable;
import designPattern.proxy.staticProxy.SiShiDaDao;

/**
 * @author 蝉沐风
 * @description 「四十大盗」金融公司计时代理
 * @date 2022/1/6
 */
public class SiShiDaDaoTimeProxy implements Payable {

    //被代理对象
    private Payable payable;

    public SiShiDaDaoTimeProxy(Payable payable) {
        this.payable = payable;
    }


    @Override
    public void pay() {
        System.out.println("方法计时开始");
        long startTime = System.currentTimeMillis();

        payable.pay();

        long endTime = System.currentTimeMillis();
        System.out.println("方法运行时长为:" + (endTime - startTime) + "毫秒");
    }
}
