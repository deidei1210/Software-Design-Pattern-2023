package Filter_new;

import SimpleFactory_new.Student;

import java.util.ArrayList;

public class JapanCriteria implements Criteria {
    //该标准判断对象国籍是否为Japan
    @Override
    public ArrayList<Student> meetCriteria(ArrayList<Student> studentList) {
        ArrayList<Student> japanstudent = new ArrayList<>();

        for (Student student : studentList) {
            if (student.getStudentTargetMajor().getTargetMajor() == "Japan") {
                studentList.add(student);
            }
        }
        return japanstudent;
    }
}
