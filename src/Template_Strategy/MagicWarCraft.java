package Template_Strategy;

import Builder.Game;
import Observer.ScoreSubject;
import Servant.Preparation;
import State.StateGood;
import State.StatePerfect;
import State.StateTired;

import java.util.Random;

public class MagicWarCraft extends Game implements Preparation {
    public MagicWarCraft(String Name) {
        super(Name);
    }

    @Override
    public void gamePreparation() {
        System.out.println("魔怪争霸2 比赛准备中...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("魔怪争霸2 比赛准备完成！");
    }

    @Override
    public void gameStart() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("魔怪争霸2 比赛开始！");
        for (int i = 0; i < 8; ++i) {
            getValue(i);
        }
        sortScore();
    }

    @Override
    public void gameEnd() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setVisited(true);
        System.out.println("魔怪争霸2 比赛完成！");
        System.out.println("魔怪争霸2最终成绩：");
        for (int i = 1; i <= 8; ++i) {
            System.out.println("参赛编号：" + i + "  姓名：" + getPlayerLists().get(i - 1).getPlayerName() + "  成绩：" + getScore()[i - 1] + "分");
        }
        System.out.println("冠军：" + getPlayerLists().get(getRankByRank()[0]).getPlayerName());
        System.out.println("亚军：" + getPlayerLists().get(getRankByRank()[1]).getPlayerName());
        System.out.println("季军：" + getPlayerLists().get(getRankByRank()[2]).getPlayerName());
        int Num = getRankByNO()[0]+1;
        System.out.println("你的名次：" + Num);
        ScoreSubject.getInstance().notifyObserver(0, getRankByNO(), getScore());
        if (getRankByNO()[0] >= 6) {
            switch (getPlayerLists().get(0).getPlayerState().toString()) {
                case "StatePerfect":
                    getPlayerLists().get(0).setPlayerState(new StateGood());
                    break;
                case "StateGood":
                    getPlayerLists().get(0).setPlayerState(new StateTired());
                    break;
                case "StateTired":
                    break;
                default:
                    break;
            }
        } else if (getRankByNO()[0] == 1) {
            switch (getPlayerLists().get(0).getPlayerState().toString()) {
                case "StatePerfect":
                    break;
                case "StateGood":
                    getPlayerLists().get(0).setPlayerState(new StatePerfect());
                    break;
                case "StateTired":
                    getPlayerLists().get(0).setPlayerState(new StateGood());
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    public void getValue(int no) {
        Random rand = new Random();
        double random = (rand.nextInt(2000) + 9000);
        Player player = getPlayerLists().get(no);
        double value = (player.getIntelligence() * 1.5 + player.getHandspeed() * 1.2 + player.getReaction() * 1 + player.getLuck() * 0.8+player.getEndurance()*0.5) / player.getPlayerState().getState();
        double result = value * 0.06547 * 2.5 * random / 10000;
        int tmp = (int)(result*100);
        result = tmp/100D;
        getScore()[no] = result;
    }

}
