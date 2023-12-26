package Filter;

import java.util.ArrayList;

public class JapanCriteria implements Criteria {
    //该标准判断对象国籍是否为Japan
    @Override
    public ArrayList<Player> meetCriteria(ArrayList<Player> playerList) {
        ArrayList<Player> japanPlayers = new ArrayList<>();

        for (Player player : playerList) {
            if (player.getPlayerNationality().getNationality() == "Japan") {
                playerList.add(player);
            }
        }
        return japanPlayers;
    }
}
