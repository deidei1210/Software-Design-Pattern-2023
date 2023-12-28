package Filter;


import SimpleFactory.Student;

import java.util.ArrayList;

public interface Criteria {
    //标准接口
    abstract ArrayList<Student> meetCriteria(ArrayList<Student> studentList);
}
