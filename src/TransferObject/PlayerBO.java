package TransferObject;

import java.util.ArrayList;
import java.util.List;

public class PlayerBO {
    List<Player> players;

    public PlayerBO() {
        players = new ArrayList<>();
        Player player1 = new PlayerFactory().createPlayer("IG", "China");
        Player player2 = new PlayerFactory().createPlayer("EDG", "Japan");
        Player player3 = new PlayerFactory().createPlayer("RNG", "America");
        players.add(player1);
        players.add(player2);
        players.add(player3);
    }

    //删除动物
    public void deletePlayer(Player player) {
        players.remove(player);
        System.out.println(player.getPlayerName() + "已经离开了!");
    }

    //getter
    public List<Player> getAllPlayers() {
        return players;
    }

    public Player getPlayer(int rollNo) {
        return players.get(rollNo);
    }

    //更新动物列表
    public void updatePlayer(Player player) {
        players.add(player);
        System.out.println(player.getPlayerName() + ", 加入了芝士煲雪嘉年华!");
    }
}