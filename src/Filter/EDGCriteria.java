package Filter;

import SimpleFactory.Player;

import java.util.ArrayList;

public class EDGCriteria implements Criteria {
    //该标准判断对象的俱乐部是不是EDG
    @Override
    public ArrayList<Player> meetCriteria(ArrayList<Player> playerList) {
        ArrayList<Player> EDGplayers = new ArrayList<>();
        for (Player player : playerList) {
            if (player.getPlayerClub().getClub() == "EDG") {
                EDGplayers.add(player);
            }
        }
        return EDGplayers;
    }
}
