package designPattern.proxy.staticProxy.usingExtends;


import designPattern.proxy.staticProxy.usingExtends.SiShiDaDaoTimeProxy;

/**
 * @author 蝉沐风
 * @description 「四十大盗」金融公司日志计时代理
 * @date 2022/1/5
 */
public class SiShiDaDaoLogTimeProxy extends SiShiDaDaoTimeProxy {

    @Override
    public void pay() {
        System.out.println("打印日志1");

        super.pay();

        System.out.println("打印日志2");
    }
}
