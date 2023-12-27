package Visitor_new;

import Builder_new.Exam;
import Iterator_new.ExamContainer;
import Iterator_new.StudentContainer;

public class CVisitorFn {
    public static void VisitorFn(int student, Exam exam) {
        Hall hall = new Hall();
        //添加模拟运动员排名信息
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
        hall.addElement(new RankingList(exam.getName(), StudentContainer.getInstance().get(student).getStudentName(),
                ExamContainer.getInstance().get(no).getStudentRank(student)+1));

        Audience audience = new Audience();
        //观众访问大厅
        hall.show(audience);

        audience.getCertainItem();
        audience.getCertainName();
        audience.getCertainRanking();


    }
}
