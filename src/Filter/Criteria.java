package Filter;


import SimpleFactory.Player;

import java.util.ArrayList;

public interface Criteria {
    //标准接口
    abstract ArrayList<Player> meetCriteria(ArrayList<Player> playerList);
}
