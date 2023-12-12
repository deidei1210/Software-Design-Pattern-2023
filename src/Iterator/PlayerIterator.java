package Iterator;

import SimpleFactory.Player;

public class PlayerIterator implements Iterator {
    //运动员的迭代器类
    private PlayerContainer playerContainer;
    private int index;

    // 将操作对象容器传入
    public PlayerIterator(PlayerContainer playerContainer) {
        this.playerContainer = playerContainer;
        this.index = 0;
    }

    //判断是否有下一个对象存在
    @Override
    public boolean hasNext() {
        return index < playerContainer.size();
    }

    //指针后移
    @Override
    public Object next() {
        Player player = playerContainer.get(index);
        index++;
        return player;
    }
}
