package Proxy_new;

import Builder_new.Exam;
import Iterator_new.ExamContainer;

public class RealScoreSheet implements ScoreSheet {
    @Override
    //打印成绩单
    public void printScoreSheet() {
        for (int i = 0; i < 4; ++i) {
            switch (i) {
                case 0:
                    System.out.println("高等数学最终成绩：");
                    break;
                case 1:
                    System.out.println("计算机408考试最终成绩：");
                    break;
                case 2:
                    System.out.println("大学英语最终成绩：");
                    break;
                case 3:
                    System.out.println("大学政治最终成绩：");
                    break;
                default:
                    break;
            }
            if (ExamContainer.getInstance().get(i).isVisited()) {
                Exam exam = ExamContainer.getInstance().get(i);
                for (int j = 1; j <= 8; ++j) {
                    System.out.println("参赛编号：" + j + "  姓名：" + exam.getStudentLists().get(j - 1).getStudentName() + "  成绩：" + exam.getScore()[j - 1] + "分");
                }
            }
        }
    }
}
