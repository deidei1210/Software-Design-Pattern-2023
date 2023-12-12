package Iterator;

import SimpleFactory.Player;

import java.util.ArrayList;

public class PlayerContainer implements Container {
    //运动员容器

    //单例模式，使运动员管理器可以被全局访问
    private static PlayerContainer instance = new PlayerContainer();
    //建立athlete容器
    private ArrayList<Player> players;

    private PlayerContainer() {
        players = new ArrayList<>();
    }

    public static PlayerContainer getInstance() {
        return instance;
    }

    //根据指针返回容器对应的对象
    public Player get(int index) {
        return players.get(index);
    }

    //在容器末尾增加对象
    public void add(Player player) {
        players.add(player);
    }

    //返回容器大小
    public int size() {
        return players.size();
    }

    //返回容器对象
    public ArrayList<Player> getplayers() {
        return players;
    }

    //生成容器迭代器
    @Override
    public Iterator iterator() {
        return new PlayerIterator(this);
    }
}
