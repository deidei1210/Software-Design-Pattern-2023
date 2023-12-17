package Builder_new;

import Iterator_new.ExamContainer;
import Template_Strategy.*;

public class ExamsBuilder {

    //单例模式
    private static ExamsBuilder instance = new ExamsBuilder();
    private ExamsBuilder() { }
    public static ExamsBuilder getInstance() {
        return instance;
    }

    //创建所有比赛
    public void buildExams() {
        //TODO: 等hjr写完模版模式再加上
//        ExamContainer.getInstance().add(new ForwardWatch("守望前锋：再也不来"));
//        ExamContainer.getInstance().add(new HeroOfFan("风扇英雄"));
//        ExamContainer.getInstance().add(new MagicWarCraft("魔怪争霸2"));
//        ExamContainer.getInstance().add(new SeaCraft("星河争霸3"));
//        ExamContainer.getInstance().add(new LoreOfLU("卢氏传说"));
//        ExamContainer.getInstance().add(new Contest("对抗赛"));
    }
}
