package designPattern.proxy.dynamicProxy.v3;

import java.lang.reflect.Method;

public interface InvocationHandler {

    /**
     * 用户自定义逻辑
     *
     * @param target 执行方法的所属对象
     * @param m      被执行方法
     * @param args   被执行方法参数
     * @return
     * @throws Throwable
     */
    Object invoke(Object target, Method m, Object[] args) throws Throwable;

}
