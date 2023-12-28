package Builder;

import AbstractFactory.Teacher;
import AbstractFactory.TeacherStore;
import Iterator.TeacherContainer;
import Iterator.StudentContainer;
import SimpleFactory.Student;

import java.util.ArrayList;
import java.util.List;

public abstract class Exam {
    //考试的名称
    private final String name;

    //参加考试的学生
    private final List<Student> StudentLists = new ArrayList<Student>();

    //出题教师
    private Teacher teacher;

    //考试分数
    private final double[] score = new double[8];

    //将学生根据序号排列
    private final int[] rankByNO = new int[8];

    //将学生根据得分排列
    private final int[] rankByRank = new int[8];

    //该考试是否已经进行过
    private boolean isTaken;

    // 题目数量
    private int numberOfQuestions;

    // 考试时间（分钟）
    private int examDuration;


    //考试的构造函数
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
        isTaken = false;
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

    public int getStudentRank(int index){
        return rankByNO[index];
    }

    public int[] getRankByRank() {
        return rankByRank;
    }

    public boolean isTaken() {
        return isTaken;
    }

    public void setTaken(boolean taken) {
        isTaken = taken;
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

    //输出考试信息
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
