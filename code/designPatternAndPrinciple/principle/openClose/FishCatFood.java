package designPatternAndPrinciple.principle.openClose;

/**
 * @author 蝉沐风
 * @description 「鱼香肉丝」猫粮
 * @date 2022/2/8
 */
public class FishCatFood extends CatFood {

    public FishCatFood(Integer count) {
        this.setCount(count);
    }

    @Override
    public void order() {
        System.out.println("售卖" + this.getCount() + "袋「鱼香肉丝」风味猫粮");
    }

}
