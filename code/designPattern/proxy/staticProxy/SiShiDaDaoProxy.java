package designPattern.proxy.staticProxy;


/**
 * @author chanmufeng
 * @description 「四十大盗」金融公司代理
 * @date 2022/1/5
 */
public class SiShiDaDaoProxy extends SiShiDaDao {

    @Override
    public void pay() {
        System.out.println("方法计时开始");
        long startTime = System.currentTimeMillis();
        super.pay();
        long endTime = System.currentTimeMillis();
        System.out.println("方法运行时长为:" + (endTime - startTime) + "毫秒");
    }
}
