package ChainOfResponsibility_new;

import ChainOfResponsibility_new.AbstractOpponent;
import SimpleFactory.Player;

public class Competitor extends AbstractOpponent {

    private Player player;
    private ChainOfResponsibility_new.Competitor competitor;

    public Competitor() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

}