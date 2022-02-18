package designPatternAndPrinciple.principle;

/**
 * @author 公众号【蝉沐风】
 * @desc 奔驰汽车厂商提供的接口
 */
public class BenzCar implements ICar{
    @Override
    public void run() {
        System.out.println("奔驰开始启动了");
    }

    @Override
    public void turn() {
        System.out.println("奔驰开始转弯了");
    }

    @Override
    public void stop() {
        System.out.println("奔驰开始停车了");
    }
}

