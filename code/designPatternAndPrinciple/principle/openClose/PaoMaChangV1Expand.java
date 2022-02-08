package designPatternAndPrinciple.principle.openClose;

/**
 * @author 蝉沐风
 * @description 原始代码功能扩展
 * @date 2022/2/8
 */
public class PaoMaChangV1Expand {

    public void order(String flavor, Integer count) {

        if (flavor.equals("毛血旺")) {
            orderMaoXueWangCatFood(count);
        } else if (flavor.equals("鱼香肉丝")) {
            orderFishCatFood(count);
        }
        // 更改1：添加口味的逻辑判断
        else if (flavor.equals("大肠刺身")) {
            orderDaChangFood(count);
        }
    }

    private void orderMaoXueWangCatFood(Integer count) {
        System.out.println("售卖" + count + "袋「毛血旺」风味猫粮");
    }

    private void orderFishCatFood(Integer count) {
        System.out.println("售卖" + count + "袋「鱼香肉丝」风味猫粮");
    }

    // 更改2：添加售卖逻辑
    private void orderDaChangFood(Integer count) {
        System.out.println("售卖" + count + "一袋「大肠刺身」风味猫粮");
    }
}
