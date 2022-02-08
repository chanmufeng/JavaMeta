package designPatternAndPrinciple.principle.openClose;

/**
 * @author 蝉沐风
 * @description 「大肠刺身」猫粮
 * @date 2022/2/8
 */
public class DaChangCatFood extends CatFood {

    public DaChangCatFood(Integer count) {
        this.setCount(count);
    }

    @Override
    public void order() {
        System.out.println("售卖" + this.getCount() + "袋「大肠刺身」风味猫粮");
    }

}
