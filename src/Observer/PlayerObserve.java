package Observer;

import Iterator.PlayerContainer;

public class PlayerObserve implements Observer {

    int PlayerNum;

    public PlayerObserve(int playerNum) {
        PlayerNum = playerNum;
    }

    //更新同步数据
    @Override
    public void update(int game, int rank, double score) {
        PlayerContainer.getInstance().get(PlayerNum).getRank()[game] = rank;
        PlayerContainer.getInstance().get(PlayerNum).getScore()[game] = score;
    }
}
