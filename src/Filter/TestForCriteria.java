package Filter;

import SimpleFactory.Player;
import SimpleFactory.PlayerFactory;

import java.util.ArrayList;

public class TestForCriteria {

    public static void main(String[] args) {
        PlayerFactory playerFactory = new PlayerFactory();
        ArrayList<Player> playerList = new ArrayList<Player>();
        playerList.add(playerFactory.createPlayer("EDG", "China"));
        playerList.add(playerFactory.createPlayer("EDG", "Japan"));
        playerList.add(playerFactory.createPlayer("EDG", "America"));
        playerList.add(playerFactory.createPlayer("IG", "China"));
        playerList.add(playerFactory.createPlayer("IG", "Japan"));
        playerList.add(playerFactory.createPlayer("RNG", "China"));
        playerList.add(playerFactory.createPlayer("RNG", "America"));
        playerList.add(playerFactory.createPlayer("IG", "America"));

        Criteria edgCriteria = new EDGCriteria();
        Criteria japanCriteria = new JapanCriteria();

        System.out.println("Before Filtering:");
        for (Player player : playerList) {
            System.out.println(player.getPlayerNationality().getNationality() + player.getPlayerClub().getClub() + ":" + player.getPlayerName());
        }
        AndCriteria andCriteria = new AndCriteria(edgCriteria, japanCriteria);
        ArrayList<Player> filterList = andCriteria.meetCriteria(playerList);

        System.out.println("After Filtering(EDG Japan):");
        for (Player player : filterList) {
            System.out.println(player.getPlayerNationality().getNationality() + player.getPlayerClub().getClub() + ":" + player.getPlayerName());
        }
    }
}
