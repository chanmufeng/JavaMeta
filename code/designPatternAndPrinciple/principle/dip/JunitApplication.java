package designPatternAndPrinciple.principle.dip;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 蝉沐风
 * @description 抽象框架
 * @date 2022/2/10
 */
public class JunitApplication {
    private static final List<TestCase> cases = new ArrayList();

    public static void register(TestCase testCase){
        cases.add(testCase);
    }

    public static void main(String[] args) {
        for(TestCase testCase : cases){
            testCase.run();
        }
    }
}
