package designPattern.proxy.staticProxy;

/**
 * @author chanmufeng
 * @description 调用客户端
 * @date 2022/1/5
 */
public class Client {
    public static void main(String[] args) {
        SiShiDaDaoProxy proxy = new SiShiDaDaoProxy();
        proxy.pay();
    }
}
