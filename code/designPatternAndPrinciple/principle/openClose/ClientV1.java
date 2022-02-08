package designPatternAndPrinciple.principle.openClose;

/**
 * @author 蝉沐风
 * @description 客户端调用
 * @date 2022/2/8
 */
public class ClientV1 {
    public static void main(String[] args) {
        PaoMaChangV1 paoMaChang  = new PaoMaChangV1();
        paoMaChang.order("毛血旺");
    }
}
