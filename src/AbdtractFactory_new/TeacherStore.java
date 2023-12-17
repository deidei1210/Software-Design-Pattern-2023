package AbdtractFactory_new;

import AbstractFactory.GameFactory;

public class TeacherStore {
    //单例模式
    private static TeacherStore instance =new TeacherStore();
    private TeacherStore(){}
    private String TeacherName;
    public static  TeacherStore getInstance(){return instance;}

    public Teacher createTeacher(String TeacherName){
        Teacher teacher = new Teacher();
        this.TeacherName=TeacherName;
        teacher.setFactory(new ExamFactory(),new TeacherFactory());
        return teacher;
    }

    public Teacher orderTeacher(String TeacherName){
        Teacher teacher=createTeacher(TeacherName);
        teacher.setExamType(teacher.getExamTypeFactory().CreateExam(TeacherName));
        teacher.setGender(teacher.getGenderFactory().CreateGender(TeacherName));
        return teacher;
    }
}
