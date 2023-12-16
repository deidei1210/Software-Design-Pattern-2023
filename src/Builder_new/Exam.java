package Builder_new;

import AbstractFactory.Judge;
import AbstractFactory.JudgeStore;
import Iterator.JudgeContainer;
import Iterator_new.StudentContainer;
import SimpleFactory_new.Student;

import java.util.ArrayList;
import java.util.List;

public abstract class Exam {
    private String name;
    private List<Student> StudentLists = new ArrayList<Student>();
    private Judge judge;
    private double[] score = new double[8];
    private int[] rankByNO = new int[8];
    private int[] rankByRank = new int[8];
    private boolean isVisited;

    public Exam(String Name) {
        name = Name;
        switch (Name) {
            case "高等数学":
                judge = JudgeStore.getInstance().orderJudge("RRLL");
                judge.setJudgeName("高等数学教学组");
                break;
            case "计算机408":
                judge = JudgeStore.getInstance().orderJudge("SCMWC");
                judge.setJudgeName("计算机专业课教学组");
                break;
            case "大学英语":
                judge = JudgeStore.getInstance().orderJudge("SCHOF");
                judge.setJudgeName("大学英语教学组");
                break;
            case "大学政治":
                judge = JudgeStore.getInstance().orderJudge("SCHOF");
                judge.setJudgeName("大学政治教学组");
                break;
            default:
                break;
        }
        JudgeContainer.getInstance().add(judge);
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

    public Judge getJudge() {
        return judge;
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
        if (judge != null) {
            System.out.println("本场出题教师：" + judge.getJudgeName());
        }
    }
}
