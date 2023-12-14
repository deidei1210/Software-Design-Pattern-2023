package Iterator;

import SimpleFactory.Student;

//学生的迭代器类
public class StudentIterator implements Iterator {
    private StudentCollection studentCollection;
    private int index;

    // 将操作对象容器传入
    public StudentIterator(StudentCollection studentCollection) {
        this.studentCollection = studentCollection;
        this.index = 0;
    }

    //判断是否有下一个对象存在
    @Override
    public boolean hasNext() {
        return index < studentCollection.size();
    }

    //指针后移
    @Override
    public Object next() {
        Student student = studentCollection.get(index);
        index++;
        return student;
    }
}

