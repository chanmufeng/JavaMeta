package designPattern.proxy.staticProxy.usingExtends;


import designPattern.proxy.staticProxy.SiShiDaDao;

/**
 * @author 蝉沐风
 * @description 「四十大盗」金融公司代理
 * @date 2022/1/5
 */
public class SiShiDaDaoTimeProxy extends SiShiDaDao {

    @Override
    public void pay() {
        System.out.println("方法计时开始");
        long startTime = System.currentTimeMillis();

        super.pay();

        long endTime = System.currentTimeMillis();
        System.out.println("方法运行时长为:" + (endTime - startTime) + "毫秒");
    }
}
