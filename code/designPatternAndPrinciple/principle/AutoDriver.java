package designPatternAndPrinciple.principle;

/**
 * @author 公众号【蝉沐风】
 * @desc 自动驾驶系统
 */
public class AutoDriver {

    private ICar car;

    public AutoDriver(ICar car) {
        this.car = car;
    }

    public void runCar() {
        car.run();
    }

    public void turnCar() {
        car.turn();
    }

    public void stopCar() {
        car.stop();
    }

}