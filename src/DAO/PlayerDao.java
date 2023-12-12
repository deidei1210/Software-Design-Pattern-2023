package DAO;

import java.util.List;

public interface PlayerDao {
    List<Player> getAllPlayers();

    Player getPlayer(int rollNo);

    void updatePlayer(Player player);//更新玩家

    void deletePlayer(Player player);//删除玩家
}
