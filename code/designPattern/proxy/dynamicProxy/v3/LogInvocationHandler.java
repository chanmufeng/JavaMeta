package designPattern.proxy.dynamicProxy.v3;

import java.lang.reflect.Method;

/**
 * @author 蝉沐风
 * @description 日志调用处理器
 * @date 2022/1/14
 */
public class LogInvocationHandler implements InvocationHandler {

    @Override
    public Object invoke(Object target, Method m, Object[] args) throws Throwable {
        return null;
    }

    private void before() {
        System.out.println("打印日志1");
    }

    private void after() {
        System.out.println("打印日志2");
    }

}
