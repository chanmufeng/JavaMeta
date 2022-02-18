package designPatternAndPrinciple.principle;

/**
 * @author 公众号【蝉沐风】
 * @desc 奥迪汽车厂商提供的接口
 */
public class AudiCar implements ICar{
    @Override
    public void run() {
        System.out.println("奥迪开始启动了");
    }

    @Override
    public void turn() {
        System.out.println("奥迪开始转弯了");
    }

    @Override
    public void stop() {
        System.out.println("奥迪开始停车了");
    }
}

