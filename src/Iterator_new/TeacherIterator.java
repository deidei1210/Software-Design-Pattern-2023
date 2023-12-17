//TODO: 改成教师

package Iterator_new;

import AbstractFactory_new.Teacher;

public class TeacherIterator implements Iterator {
    //裁判的迭代器类
    private TeacherContainer teacherContainer;
    private int index;

    // 将操作对象容器传入
    public TeacherIterator(TeacherContainer teacherContainer) {
        this.teacherContainer = teacherContainer;
        this.index = 0;
    }

    //判断是否有下一个对象存在
    @Override
    public boolean hasNext() {
        return index < teacherContainer.size();
    }

    //指针后移
    @Override
    public Object next() {
        Teacher teacher = teacherContainer.get(index);
        index++;
        return teacher;
    }
}
