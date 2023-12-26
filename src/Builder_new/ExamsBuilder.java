package Builder_new;

import Iterator_new.ExamContainer;
import TemplateAndStrategy_new.AdvancedMath;
import TemplateAndStrategy_new.CollegeEnglish;
import TemplateAndStrategy_new.CollegePolitics;
import TemplateAndStrategy_new.ComputerBasics;
import Template_Strategy.*;

//用来创建考试
public class ExamsBuilder {

    //单例模式
    private static ExamsBuilder instance = new ExamsBuilder();
    private ExamsBuilder() { }
    public static ExamsBuilder getInstance() {
        return instance;
    }

    //创建所有比赛
    public void buildExams() {
        ExamContainer.getInstance().add(new AdvancedMath("高等数学"));
        ExamContainer.getInstance().add(new CollegeEnglish("大学英语"));
        ExamContainer.getInstance().add(new CollegePolitics("大学政治"));
        ExamContainer.getInstance().add(new ComputerBasics("计算机408"));
    }
}
