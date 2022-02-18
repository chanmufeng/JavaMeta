package designPattern.proxy.dynamicProxy.cglib;

import designPattern.proxy.dynamicProxy.SiShiDaDao;
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


public class Client {
    public static void main(String[] args) {

        try {
            //将自动生成的.class文件写入磁盘
            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E:/cglib_proxy_classes");

            final SiShiDaDao target = new SiShiDaDao();

            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(SiShiDaDao.class);
            enhancer.setCallback(new MethodInterceptor() {

                @Override
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                    if (method.getName().equals("pay")) {
                        System.out.println("打印日志1");
                        method.invoke(target, objects);
                        System.out.println("打印日志2");
                        return null;
                    }
                    return method.invoke(target, objects);
                }
            });

            SiShiDaDao proxy = (SiShiDaDao) enhancer.create();
            proxy.pay();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
