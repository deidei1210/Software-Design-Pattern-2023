package Template_Strategy;

import Builder.Game;
import ChainOfResponsibility.PlayerFighters;
import Servant.Preparation;

public class Contest extends Game implements Preparation {

    private PlayerFighters playerFighters;

    public Contest(String Name) {
        super(Name);
        playerFighters = new PlayerFighters();
    }

    @Override
    public void gameStart() {
        playerFighters.fight();
    }

    @Override
    public void gameEnd() {
        setVisited(true);
    }

    @Override
    public void getValue(int no) {

    }

    @Override
    public void gamePreparation() {

    }
}
