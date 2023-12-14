package Iterator;

import SimpleFactory.Student;

import java.util.ArrayList;

// 学生聚合对象
public class StudentCollection implements Collection{

    private static StudentCollection instance = new StudentCollection(); //单例模式，使学生管理器可以被全局访问
    //建立athlete容器
    private ArrayList<Student> students;

    private StudentCollection() {
        students = new ArrayList<>();
    }

    public static StudentCollection getInstance() {
        return instance;
    }

    //根据指针返回容器对应的对象
    public Student get(int index) {
        return students.get(index);
    }

    //在容器末尾增加对象
    public void add(Student student) {
        students.add(student);
    }

    //返回容器大小
    public int size() {
        return students.size();
    }

    //返回容器对象
    public ArrayList<Student> getstudents() {
        return students;
    }

    //生成容器迭代器
    @Override
    public Iterator createIterator() {
        return new StudentIterator(this);
    }

}
