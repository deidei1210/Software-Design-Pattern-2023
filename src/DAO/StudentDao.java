package DAO;

import java.util.List;

public interface StudentDao {
    List<Student> getAllStudents();

    Student getStudent(int rollNo);

    void updateStudent(Student student);//更新玩家

    void deleteStudent(Student student);//删除玩家
}
