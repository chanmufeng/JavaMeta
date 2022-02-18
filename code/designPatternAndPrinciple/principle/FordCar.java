package designPatternAndPrinciple.principle;

/**
 * @author 公众号【蝉沐风】
 * @desc 福特汽车厂商提供的接口
 */
public class FordCar implements ICar{
    @Override
    public void run(){
        System.out.println("福特开始启动了");
    }
    @Override
    public void turn(){
        System.out.println("福特开始转弯了");
    }
    @Override
    public void stop(){
        System.out.println("福特开始停车了");
    }
}