package designPatternAndPrinciple.proxy.dynamicProxy;

import java.util.concurrent.TimeUnit;

/**
 * @author 蝉沐风
 * @description 「四十大盗」金融公司提供的第三方接口，实现了支付接口
 * @date 2022/1/10
 */
public class SiShiDaDao implements Payable {

    @Override
    public void pay() {
        try {
            // ...
            System.out.println("「四十大盗」支付接口调用中......");
            //模拟方法调用延时
            TimeUnit.MILLISECONDS.sleep((long) (Math.random() * 6000));
            // ...
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
