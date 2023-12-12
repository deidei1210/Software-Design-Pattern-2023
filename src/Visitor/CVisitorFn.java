package Visitor;

import Builder.Game;
import Iterator.PlayerContainer;

public class CVisitorFn {
    public static void VisitorFn(int player, Game game) {
        Hall hall = new Hall();
        //添加模拟运动员排名信息
        int no = 0;
        switch (game.getName()) {
            case "守望前锋：再也不来":
                break;
            case "风扇英雄":
                no = 1;
                break;
            case "魔怪争霸2":
                no = 2;
                break;
            case "星河争霸3":
                no = 3;
                break;
            case "卢氏传说":
                no = 4;
                break;
        }
        hall.addElement(new RankingList(game.getName(), PlayerContainer.getInstance().get(player).getPlayerName(),
            PlayerContainer.getInstance().get(player).getRank()[no]));

        RankingViewer audience = new Audience();
        //观众访问大厅
        hall.show(audience);

        ((Audience) audience).getCertainItem();
        ((Audience) audience).getCertainName();
        ((Audience) audience).getCertainRanking();


    }
}
