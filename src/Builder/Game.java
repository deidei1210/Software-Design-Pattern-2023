package Builder;

import AbstractFactory.Judge;
import AbstractFactory.JudgeStore;
import Iterator.PlayerContainer;
import Iterator.JudgeContainer;
import SimpleFactory.Player;

import java.util.ArrayList;
import java.util.List;

public abstract class Game {
    private String name;
    private List<Player> PlayerLists = new ArrayList<Player>();
    private Judge judge;
    private double[] score = new double[8];
    private int[] rankByNO = new int[8];
    private int[] rankByRank = new int[8];
    private boolean isVisited;

    public Game(String Name) {
        name = Name;
        switch (Name) { 
            case "守望前锋：再也不来": 
                judge = JudgeStore.getInstance().orderJudge("RRLL");
                judge.setJudgeName("赤小兔");
                break;
            case "卢氏传说":
                judge = JudgeStore.getInstance().orderJudge("SCMWC");
                judge.setJudgeName("星际老男孩");
                break;
            case "星河争霸":
                judge = JudgeStore.getInstance().orderJudge("SCHOF");
                judge.setJudgeName("星际老男孩");
                break;
            default:
                break;
        }
        JudgeContainer.getInstance().add(judge);
        for (int i = 0; i < 8; ++i) {
            addPlayer(PlayerContainer.getInstance().get(i));
        }
        isVisited = false;
    }

    //getter & setter
    public void addPlayer(Player player) {
        PlayerLists.add(player);
    }

    public abstract void gameStart();

    public abstract void gameEnd();

    public abstract void getValue(int no);

    public String getName() {
        return name;
    }

    public List<Player> getPlayerLists() {
        return PlayerLists;
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
    public void showGameInfo() {
        System.out.println("比赛名称：" + name);
        System.out.println("参赛玩家名单：");
        for (int i = 1; i <= 8; ++i) {
            System.out.println("参赛编号：" + i + "  姓名：" + PlayerLists.get(i - 1).getPlayerName());
        }
        if (judge != null) {
            System.out.println("本场裁判：" + judge.getJudgeName());
        }
    }

}
