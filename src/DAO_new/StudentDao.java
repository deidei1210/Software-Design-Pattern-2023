package DAO_new;

import java.util.List;

public interface StudentDao {
    List<DAO.Student> getAllStudents();

    DAO.Student getStudent(int rollNo);

    void updateStudent(DAO.Student student);//更新玩家

    void deleteStudent(Student student);//删除玩家
}
