package DAO_new;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    //列表是当作一个数据库
    List<DAO.Student> students;

    //添加369和Ming
    public StudentDaoImpl() {
        students = new ArrayList<DAO.Student>();
        DAO.Student student1 = new DAO.Student("369", 0);
        DAO.Student student2 = new DAO.Student("Ming", 1);
        players.add(student1);
        players.add(student2);
    }

    //删除
    @Override
    public void deleteStudent(DAO.Student student) {
        students.remove(student.getRollNo());
        System.out.println("编号 " + student.getRollNo()
                + ", 数据库已删除");
    }

    //从数据库中检索玩家名单
    @Override
    public List<DAO.Student> getAllStudents() {
        return students;
    }

    @Override
    public DAO.Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student player) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("编号 " + student.getRollNo()
                + ", 数据库已更新");
    }
}