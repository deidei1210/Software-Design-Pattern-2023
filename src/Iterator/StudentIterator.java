package Iterator;

import SimpleFactory.Student;

public class StudentIterator implements Iterator {
    //运动员的迭代器类
    private StudentContainer studentContainer;
    private int index;

    // 将操作对象容器传入
    public StudentIterator(StudentContainer studentContainer) {
        this.studentContainer = studentContainer;
        this.index = 0;
    }

    //判断是否有下一个对象存在
    @Override
    public boolean hasNext() {
        return index < studentContainer.size();
    }

    //指针后移
    @Override
    public Object next() {
        Student student = studentContainer.get(index);
        index++;
        return student;
    }
}
