package Filter_new;

import SimpleFactory_new.Student;
import java.util.ArrayList;
import java.util.Objects;

public class SECriteria implements Criteria {
    //该标准判断对象的俱乐部是不是软件工程
    @Override
    public ArrayList<Student> meetCriteria(ArrayList<Student> studentList) {
        ArrayList<Student> SEstudent = new ArrayList<>();
        for (Student student : studentList) {
            if (Objects.equals(student.getStudentTargetMajor(), "Software Engineering")) {
                SEstudent.add(student);
            }
        }
        return SEstudent;
    }
}
