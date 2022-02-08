package designPatternAndPrinciple.proxy.dynamicProxy.v3;

import java.lang.reflect.Method;

/**
 * @author 蝉沐风
 * @description 日志调用处理器
 * @date 2022/1/14
 */
public class LogInvocationHandler implements InvocationHandler {

    // 被代理对象
    private Object target;

    public LogInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Method m, Object[] args) throws Throwable {
        before();
        Object res = m.invoke(target, args);
        after();

        return res;
    }

    private void before() {
        System.out.println("打印日志1");
    }

    private void after() {
        System.out.println("打印日志2");
    }

}
