package jvm;

/**
 * @author chanmufeng
 * @description 测试字节码文件的源码
 * @date 2022/1/9
 */
public class Person {

    private String name = "蝉沐风";
    private int age;
    private final double salary = 123.4;
    private static String address;
    private final static String cat = "陀螺";
    private static Object obj = new Object();

    public void say() {
        System.out.println("hello world");
    }

    public static int calc(int op1, int op2) {
        op1 = 3;
        int result = op1 + op2;
        Object obj = new Object();
        return result;
    }

    public static void main(String[] args) {
        calc(1, 2);
    }
}
