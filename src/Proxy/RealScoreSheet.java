package Proxy;

import Builder.Game;

public class RealScoreSheet implements ScoreSheet {
    @Override
    //打印成绩单
    public void printScoreSheet() {
        for (int i = 0; i < 5; ++i) {
            switch (i) {
                case 0:
                    System.out.println("守望前锋：再也不来最终成绩：");
                    break;
                case 1:
                    System.out.println("风扇英雄最终成绩：");
                    break;
                case 2:
                    System.out.println("魔怪争霸2最终成绩：");
                    break;
                case 3:
                    System.out.println("星河争霸3最终成绩：");
                    break;
                case 4:
                    System.out.println("卢氏传说最终成绩：");
                    break;
                default:
                    break;
            }
            if (GameContainer.getInstance().get(i).isVisited()) {
                Game game = GameContainer.getInstance().get(i);
                for (int j = 1; j <= 8; ++j) {
                    System.out.println("参赛编号：" + j + "  姓名：" + game.getPlayerLists().get(j - 1).getPlayerName() + "  成绩：" + game.getScore()[j - 1] + "分");
                }
            }
        }
    }
}
