package ljx.ashin.proxy;

import ljx.ashin.impl.TeacherServiceImpl;
import ljx.ashin.service.TeacherService;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Ashin Liang on 2017/12/25.
 */
public class TeacherServiceProxy {

    public static void main(String[] args) {
        final TeacherServiceImpl service = new TeacherServiceImpl();
        TeacherService proxyTeacherService = (TeacherService) Proxy.newProxyInstance(
                TeacherServiceImpl.class.getClassLoader(), TeacherServiceImpl.class.getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开始调用TeacherService的动态代理类");
                        Object objResult = method.invoke(service,args);
                        return objResult;
                    }
                }
        );

        System.out.println(proxyTeacherService.getTeacherNum());
    }
}
