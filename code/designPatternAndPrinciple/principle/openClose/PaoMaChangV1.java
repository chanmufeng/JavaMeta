package designPatternAndPrinciple.principle.openClose;

/**
 * @author 蝉沐风
 * @description 原始代码
 * @date 2022/2/8
 */
public class PaoMaChangV1 {

    public void order(String flavor) {

        if (flavor.equals("毛血旺")) {
            orderMaoXueWangCatFood();
        } else if (flavor.equals("鱼香肉丝")) {
            orderFishCatFood();
        }
    }

    private void orderMaoXueWangCatFood() {
        System.out.println("售卖一袋「毛血旺」风味猫粮");
    }

    private void orderFishCatFood() {
        System.out.println("售卖一袋「鱼香肉丝」风味猫粮");
    }

}
