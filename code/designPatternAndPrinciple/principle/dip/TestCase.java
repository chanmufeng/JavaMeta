package designPatternAndPrinciple.principle.dip;

/**
 * @author 蝉沐风
 * @description 模拟测试用例
 * @date 2022/2/10
 */
public abstract class TestCase {
    public void run() {
        if (doTest()) {
            System.out.println("Test succeed.");
        } else {
            System.out.println("Test failed.");
        }
    }

    public abstract boolean doTest();
}
