package designPatternAndPrinciple.principle.openClose;

/**
 * @author 蝉沐风
 * @description 客户端调用
 * @date 2022/2/8
 */
public class ClientV2 {
    public static void main(String[] args) {
        PaoMaChangV2 paoMaChang  = new PaoMaChangV2();

        // 创建对应口味的猫粮
        FishCatFood fish = new FishCatFood(2);
        paoMaChang.order(fish);
    }
}
