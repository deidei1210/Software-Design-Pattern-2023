package Visitor;

import Builder.Exam;
import Iterator.ExamContainer;
import Iterator.StudentContainer;

public class VisitorFunction {
    public static void visitorFunction(int student, Exam exam) {
        RankList rankList = new RankList();
        //添加模拟学生排名信息
        int no = 0;
        switch (exam.getName()) {
            case "高等数学":
                break;
            case "大学英语":
                no = 1;
                break;
            case "大学政治":
                no = 2;
                break;
            case "计算机408":
                no = 3;
                break;
        }
        rankList.addElement(new RankingList(exam.getName(), StudentContainer.getInstance().get(student).getStudentName(),
                ExamContainer.getInstance().get(no).getStudentRank(student)+1));

        RankViewingStudent rankViewingStudent = new RankViewingStudent();
        //观众访问大厅
        rankList.show(rankViewingStudent);

        rankViewingStudent.getCertainItem();
        rankViewingStudent.getCertainName();
        rankViewingStudent.getCertainRanking();


    }
}
