package TemplateAndStrategy_new;

import Builder_new.Exam;
import Observer.ScoreSubject;
import Servant_new.Preparation;
import SimpleFactory_new.Student;
import State_new.StateGood;
import State_new.StatePerfect;
import State_new.StateTired;

import java.util.Random;

public class AdvancedMath extends Exam implements Preparation {
    public AdvancedMath(String Name) {
        super(Name);
    }

    @Override
    public void examPreparation() {
        System.out.println("高等数学 模拟考试准备中...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("高等数学 模拟考试准备完成！");
    }

    @Override
    public void examStart() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("高等数学 模拟考试开始！");
        for (int i = 0; i < 8; ++i) {
            getValue(i);
        }
        sortScore();
    }

    @Override
    public void examEnd() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("高等数学 模拟考试结束！");
        System.out.println("高等数学模拟考试最终成绩：");
        setVisited(true);
        for (int i = 1; i <= 8; ++i) {
            System.out.println("模拟考试考号：" + i + "  姓名：" + getStudentLists().get(i - 1).getStudentName() + "  成绩：" + getScore()[i - 1] + "分");
        }
        System.out.println("状元：" + getStudentLists().get(getRankByRank()[0]).getStudentName());
        System.out.println("榜眼：" + getStudentLists().get(getRankByRank()[1]).getStudentName());
        System.out.println("探花：" + getStudentLists().get(getRankByRank()[2]).getStudentName());
        int Num = getRankByNO()[0]+1;
        System.out.println("你的排名：" + Num);
        ScoreSubject.getInstance().notifyObserver(2, getRankByNO(), getScore());
        if (getRankByNO()[0] >= 6) {
            switch (getStudentLists().get(0).getStudentState().toString()) {
                case "StatePerfect":
                    getStudentLists().get(0).setStudentState(new StateGood());
                    break;
                case "StateGood":
                    getStudentLists().get(0).setStudentState(new StateTired());
                    break;
                case "StateTired":
                    break;
                default:
                    break;
            }
        } else if (getRankByNO()[0] == 1) {
            switch (getStudentLists().get(0).getStudentState().toString()) {
                case "StatePerfect":
                    break;
                case "StateGood":
                    getStudentLists().get(0).setStudentState(new StatePerfect());
                    break;
                case "StateTired":
                    getStudentLists().get(0).setStudentState(new StateGood());
                    break;
                default:
                    break;
            }
        }
    }
    //具体的指标，和dtt商量
    @Override
    public void getValue(int no) {
        Random rand = new Random();
        double random = (rand.nextInt(2000) + 9000);
        Student student = getStudentLists().get(no);
        double value = (student.getReaction() * 1.5 + student.getLuck() * 1.2 + student.getIntelligence() * 1 + student.getEndurance() * 0.8+student.getHandspeed()*0.5) / student.getStudentState().getState();
        double result = value * 0.06547 * 2.5 * random / 10000;
        int tmp = (int)(result*100);
        result = tmp/100D;
        getScore()[no] = result;
    }

}

