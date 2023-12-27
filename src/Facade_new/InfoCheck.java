package Facade_new;

import Iterator_new.StudentContainer;
public class InfoCheck {
    public void doSomething() {
        System.out.println("学生信息检查...");
        System.out.println("您的姓名：" + StudentContainer.getInstance().get(0).getStudentName());
        System.out.println("您的目标专业：" + StudentContainer.getInstance().get(0).getStudentTargetMajor());
        System.out.println("您的学历：" + StudentContainer.getInstance().get(0).getStudentEducationalLevel());
    }
}
