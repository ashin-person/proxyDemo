package ljx.ashin.service;

/**
 * Created by Ashin Liang on 2017/12/25.
 */
public interface TeacherService {
    /**
     * 获取老师的数量
     * @return
     */
    public String getTeacherNum();

    /**
     * 获取教师信息
     * @param name
     * @return
     */
    public String getTeacherMsg(String name);
}
