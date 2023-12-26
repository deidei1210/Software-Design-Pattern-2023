package Filter_new;


import SimpleFactory_new.Student;

import java.util.ArrayList;

public interface Criteria {
    //标准接口
    abstract ArrayList<Student> meetCriteria(ArrayList<Student> studentList);
}
