package designPattern.proxy.dynamicProxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 蝉沐风
 * @desc CGLib代理
 */
public class CGlibProxy implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) throws Exception {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        this.before();
        Object obj = methodProxy.invokeSuper(o, objects);
        this.after();
        return obj;
    }

    private void before() {
        System.out.println("打印日志1");
    }

    private void after() {
        System.out.println("打印日志2");
    }

}
