package designPatternAndPrinciple.principle.openClose;

/**
 * @author 蝉沐风
 * @description 「毛血旺」猫粮
 * @date 2022/2/8
 */
public class MaoXueWangCatFood extends CatFood {

    public MaoXueWangCatFood(Integer count) {
        this.setCount(count);
    }

    @Override
    public void order() {
        System.out.println("售卖" + this.getCount() + "袋「毛血旺」风味猫粮");
    }
}
