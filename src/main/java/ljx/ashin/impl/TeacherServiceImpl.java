package ljx.ashin.impl;

import ljx.ashin.service.TeacherService;

/**
 * Created by Ashin Liang on 2017/12/25.
 */
public class TeacherServiceImpl implements TeacherService {
    /**
     * 获取老师的数量
     *
     * @return
     */
    public String getTeacherNum() {
        System.out.println("调用teacherService获取老师的数量");
        return "345";
    }

    /**
     * 获取教师信息
     *
     * @param name
     * @return
     */
    public String getTeacherMsg(String name) {
        System.out.println("参数name:"+name);
        return "教师:"+name+"的完整信息";
    }
}
