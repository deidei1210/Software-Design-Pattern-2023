package Iterator_new;

import SimpleFactory_new.Student;

import java.util.ArrayList;

public class StudentContainer implements Container {
    //运动员容器

    //单例模式，使运动员管理器可以被全局访问
    private static StudentContainer instance = new StudentContainer();
    //建立athlete容器
    private ArrayList<Student> students;

    private StudentContainer() {
        students = new ArrayList<>();
    }

    public static StudentContainer getInstance() {
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
    public Iterator iterator() {
        return new StudentIterator(this);
    }
}
