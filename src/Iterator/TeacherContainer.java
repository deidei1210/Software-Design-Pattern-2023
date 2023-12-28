package Iterator;

import AbstractFactory.Teacher;

import java.util.ArrayList;

public class TeacherContainer implements Container {
    //裁判容器

    //单例模式
    private static TeacherContainer instance = new TeacherContainer();
    //建立teacher容器
    private ArrayList<Teacher> teachers;

    private TeacherContainer() {
        teachers = new ArrayList<>();
    }

    public static TeacherContainer getInstance() {
        return instance;
    }

    //根据指针返回容器对应的对象
    public Teacher get(int index) {
        return teachers.get(index);
    }

    //在容器末尾增加对象
    public void add(Teacher teacher) {
        teachers.add(teacher);
    }

    //返回容器大小
    public int size() {
        return teachers.size();
    }

    //返回容器对象
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    //生成容器迭代器
    @Override
    public Iterator iterator() {
        return new TeacherIterator(this);
    }
}
