package designPatternAndPrinciple.principle;

/**
 * @author 公众号【蝉沐风】
 * @desc 宝马汽车厂商提供的接口
 */
public class BmwCar implements ICar {
    @Override
    public void run() {
        System.out.println("宝马开始启动了");
    }

    @Override
    public void turn() {
        System.out.println("宝马开始转弯了");
    }

    @Override
    public void stop() {
        System.out.println("宝马开始停车了");
    }
}

