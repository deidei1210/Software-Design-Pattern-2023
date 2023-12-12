package DAO;

import java.util.ArrayList;
import java.util.List;

public class PlayerDaoImpl implements PlayerDao {

    //列表是当作一个数据库
    List<Player> players;

    //添加369和Ming
    public PlayerDaoImpl() {
        players = new ArrayList<Player>();
        Player player1 = new Player("369", 0);
        Player player2 = new Player("Ming", 1);
        players.add(player1);
        players.add(player2);
    }

    //删除
    @Override
    public void deletePlayer(Player player) {
        players.remove(player.getRollNo());
        System.out.println("编号 " + player.getRollNo()
                + ", 数据库已删除");
    }

    //从数据库中检索玩家名单
    @Override
    public List<Player> getAllPlayers() {
        return players;
    }

    @Override
    public Player getPlayer(int rollNo) {
        return players.get(rollNo);
    }

    @Override
    public void updatePlayer(Player player) {
        players.get(player.getRollNo()).setName(player.getName());
        System.out.println("编号 " + player.getRollNo()
                + ", 数据库已更新");
    }
}