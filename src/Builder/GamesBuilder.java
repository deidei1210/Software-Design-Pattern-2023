package Builder;

import Template_Strategy.Contest;
import Template_Strategy.ForwardWatch;
import Template_Strategy.HeroOfFan;
import Template_Strategy.LoreOfLU;
import Template_Strategy.MagicWarCraft;
import Template_Strategy.SeaCraft;

public class GamesBuilder {

    //单例模式
    private static GamesBuilder instance = new GamesBuilder();
    private GamesBuilder() { }
    public static GamesBuilder getInstance() {
        return instance;
    }

    //创建所有比赛
    public void buildGames() {
        GameContainer.getInstance().add(new ForwardWatch("守望前锋：再也不来"));
        GameContainer.getInstance().add(new HeroOfFan("风扇英雄"));
        GameContainer.getInstance().add(new MagicWarCraft("魔怪争霸2"));
        GameContainer.getInstance().add(new SeaCraft("星河争霸3"));
        GameContainer.getInstance().add(new LoreOfLU("卢氏传说"));
        GameContainer.getInstance().add(new Contest("对抗赛"));
    }
}
