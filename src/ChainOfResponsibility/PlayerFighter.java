package ChainOfResponsibility;

public class PlayerFighter extends AbstractOpponent {

    private Player player;
    private PlayerFighter presentFighter;

    public PlayerFighter() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

}

