package ljx.ashin.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理的工具类
 * Created by Ashin Liang on 2017/12/25.
 */
public class ProxyUtils {
    /**
     * 获取某个类的动态代理类
     * @param interfaceClass
     * @param implClass
     * @param <T>
     * @return
     */
    public static  <T> T getProxyObj(Class<T> interfaceClass, final Class implClass){
        T t =(T) Proxy.newProxyInstance(implClass.getClassLoader(), new Class[]{interfaceClass},
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开始调用动态代理类");
                        Object invokeResult = method.invoke(implClass.newInstance(),args);// 调用任何public方法都拦截
                        System.out.println("调用动态代理类结束");
                        return invokeResult;
                    }
                });
        return t;
    }
}
