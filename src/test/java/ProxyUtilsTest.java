import ljx.ashin.impl.TeacherServiceImpl;
import ljx.ashin.proxy.ProxyUtils;
import ljx.ashin.service.TeacherService;
import org.junit.Test;

/**
 * Created by Ashin Liang on 2017/12/25.
 */
public class ProxyUtilsTest {
    @Test
    public void testProxy(){
        TeacherService teacherService = ProxyUtils.getProxyObj(TeacherService.class,
                TeacherServiceImpl.class);
        System.out.println(teacherService.getTeacherNum());
    }
}
