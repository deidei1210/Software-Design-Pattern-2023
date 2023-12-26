package DAO_new;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    //列表是当作一个数据库
    List<Student> students;

    //添加369和Ming
    public StudentDaoImpl() {
        students = new ArrayList<Student>();
        Student student1 = new Student("小笼猫", 0);
        Student student2 = new Student("呜咪咪", 1);
        students.add(student1);
        students.add(student2);
    }

    //删除
    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        System.out.println("编号 " + student.getRollNo()
                + ", 数据库已删除");
    }

    //从数据库中检索玩家名单
    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("编号 " + student.getRollNo()
                + ", 数据库已更新");
    }
}