package designPattern.proxy.staticProxy.usingExtends;


/**
 * @author chanmufeng
 * @description 调用客户端
 * @date 2022/1/5
 */
public class Client {
    public static void main(String[] args) {
        SiShiDaDaoLogTimeProxy proxy = new SiShiDaDaoLogTimeProxy();
        proxy.pay();
    }
}

//    Payable payable = new SiShiDaDao();
//
//        System.out.println("方法计时开始");
//                long startTime = System.currentTimeMillis();
//                payable.pay();
//                long endTime = System.currentTimeMillis();
//                System.out.println("方法运行时长为:" + (endTime - startTime) + "毫秒");

