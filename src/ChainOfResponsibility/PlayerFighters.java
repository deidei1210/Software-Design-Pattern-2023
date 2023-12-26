package ChainOfResponsibility;

import java.util.ArrayList;
import java.util.Random;

public class PlayerFighters {

    private ArrayList<PlayerFighter> playerFighters = new ArrayList<>();
    private PlayerFighter presentFighter;

    public PlayerFighters() {
        for (int i = 0; i < 8; ++i) {
            PlayerFighter playerFighter = new PlayerFighter();
            playerFighter.setPlayer(PlayerContainer.getInstance().get(i));
            playerFighters.add(playerFighter);
        }
    }

    public void fight() {
        int i = 1;
        presentFighter = playerFighters.get(0);
        presentFighter.setNextAbstractOpponent(playerFighters.get(1));

        while (i < playerFighters.size()) {
            PlayerFighter nextFighter = (PlayerFighter) presentFighter.getNextAbstractOpponent();
            Random rand1 = new Random();
            double random1 = (rand1.nextInt(2000) + 9000);
            Random rand2 = new Random();
            double random2 = (rand2.nextInt(2000) + 9000);
            double value1 = (presentFighter.getPlayer().getEndurance() * 10 + presentFighter.getPlayer().getHandspeed() * 11
                    + presentFighter.getPlayer().getIntelligence() * 14 + presentFighter.getPlayer().getReaction() * 12)
                    * presentFighter.getPlayer().getPlayerState().getState() * random1;
            double value2 = (nextFighter.getPlayer().getEndurance() * 10 + nextFighter.getPlayer().getHandspeed() * 11
                    + nextFighter.getPlayer().getIntelligence() * 14 + nextFighter.getPlayer().getReaction() * 12)
                    * nextFighter.getPlayer().getPlayerState().getState() * random2;
            if (value1 >= value2) {
                System.out.println("第" + i + "轮：" + presentFighter.getPlayer().getPlayerName()
                        + " vs " + nextFighter.getPlayer().getPlayerName() + "  胜者："
                        + presentFighter.getPlayer().getPlayerName());
                if (i == 7) break;
                presentFighter.setNextAbstractOpponent(playerFighters.get(++i));
            } else {
                System.out.println("第" + i + "轮：" + presentFighter.getPlayer().getPlayerName()
                        + " vs " + nextFighter.getPlayer().getPlayerName() + "  胜者："
                        + nextFighter.getPlayer().getPlayerName());
                if (i == 7) break;
                presentFighter = (PlayerFighter) presentFighter.getNextAbstractOpponent();
                presentFighter.setNextAbstractOpponent(playerFighters.get(++i));
            }
        }
        System.out.println("冠军是" + presentFighter.getPlayer().getPlayerName() + '!');
    }
}
