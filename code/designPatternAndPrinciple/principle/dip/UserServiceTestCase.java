package designPatternAndPrinciple.principle.dip;

public class UserServiceTestCase extends TestCase{
    @Override
    public boolean doTest() {
        //此处编写自己的判断逻辑
        return false;
    }

}

class A{
    Object b = new B();
    ...
}

class B{
    Object c = new C();
    Object d = new D();
    ...
}

class C{
    Object d = new D();
}