package designPattern.proxy.dynamicProxy.v3;

import java.lang.reflect.Method;

public interface InvocationHandler {

    /**
     * 用户自定义逻辑
     *
     * @param proxy 实际生成的代理对象
     * @param m     被执行方法
     * @param args  被执行方法参数
     * @return
     * @throws Throwable
     */
    Object invoke(Object proxy, Method m, Object[] args) throws Throwable;

}
