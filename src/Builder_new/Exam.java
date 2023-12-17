package Builder_new;

import AbstractFactory_new.Teacher;
import AbstractFactory_new.TeacherStore;
import Iterator_new.TeacherContainer;
import Iterator_new.StudentContainer;
import SimpleFactory_new.Student;

import java.util.ArrayList;
import java.util.List;

public abstract class Exam {
    private String name;
    private List<Student> StudentLists = new ArrayList<Student>();
    private Teacher teacher;
    private double[] score = new double[8];
    private int[] rankByNO = new int[8];
    private int[] rankByRank = new int[8];
    private boolean isVisited;
    private int numberOfQuestions; // 题目数量
    private int examDuration; // 考试时间（分钟）


    public Exam(String Name) {
        name = Name;
        switch (name) {
            case "高等数学":
                //TODO: teacher改成教师
                teacher = TeacherStore.getInstance().orderTeacher("RRLL");
                teacher.setTeacherName("高等数学教学组");
                numberOfQuestions = 20;
                examDuration = 90;
                break;
            case "计算机408":
                teacher = TeacherStore.getInstance().orderTeacher("SCMWC");
                teacher.setTeacherName("计算机专业课教学组");
                numberOfQuestions = 30;
                examDuration = 120;
                break;
            case "大学英语":
                teacher = TeacherStore.getInstance().orderTeacher("SCHOF");
                teacher.setTeacherName("大学英语教学组");
                numberOfQuestions = 25;
                examDuration = 100;
                break;
            case "大学政治":
                teacher = TeacherStore.getInstance().orderTeacher("SCHOF");
                teacher.setTeacherName("大学政治教学组");
                numberOfQuestions = 15;
                examDuration = 75;
                break;
            default:
                break;
        }
        TeacherContainer.getInstance().add(teacher);
        for (int i = 0; i < 8; ++i) {
            addStudent(StudentContainer.getInstance().get(i));
        }
        isVisited = false;
    }

    //getter & setter
    public void addStudent(Student student) {
        StudentLists.add(student);
    }

    public abstract void examStart();

    public abstract void examEnd();

    public abstract void getValue(int no);

    public String getName() {
        return name;
    }

    public List<Student> getStudentLists() {
        return StudentLists;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public double[] getScore() {
        return score;
    }

    public int[] getRankByNO() {
        return rankByNO;
    }

    public int[] getRankByRank() {
        return rankByRank;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public int getNumberOfQuestions() {return numberOfQuestions;}

    public void setNumberOfQuestions(int numberOfQuestions) {this.numberOfQuestions = numberOfQuestions;}

    public int getExamDuration() {return examDuration;}

    public void setExamDuration(int examDuration) {this.examDuration = examDuration;}

    //排名
    public void sortScore() {
        for (int i = 0; i < 8; ++i) {
            rankByNO[i] = 0;
        }
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                if (score[i] > score[j]) {
                    ++rankByNO[j];
                }
            }
        }
        for (int i = 0; i < 8; ++i) {
            rankByRank[rankByNO[i]] = i;
        }
    }

    //输出测试信息
    public void showExamInfo() {
        System.out.println("考试名称：" + name);
        System.out.println("参加考试的学生名单：");
        for (int i = 1; i <= 8; ++i) {
            System.out.println("参加考试编号：" + i + "  姓名：" + StudentLists.get(i - 1).getStudentName());
        }
        if (teacher != null) {
            System.out.println("本场出题教师：" + teacher.getTeacherName());
        }
    }
}
