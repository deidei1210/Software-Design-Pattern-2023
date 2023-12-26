package TransferObject_new;

import SimpleFactory_new.Student;
import SimpleFactory_new.StudentFactory;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {
    List<Student> students;

    public StudentBO() {
        students = new ArrayList<>();
        Student student1 = new StudentFactory().createStudent("IG", "China");
        Student student2 = new StudentFactory().createStudent("EDG", "Japan");
        Student student3 = new StudentFactory().createStudent("RNG", "America");
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    //删除动物
    public void deleteStudent(Student student) {
        students.remove(student);
        System.out.println(student.getStudentName() + "已经离开了!");
    }

    //getter
    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    //更新动物列表
    public void updateStudent(Student student) {
        students.add(student);
        System.out.println(student.getStudentName() + ", 加入了芝士煲雪嘉年华!");
    }
}