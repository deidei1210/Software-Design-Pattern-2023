package Command;

import Decorator.Food;

public interface Command {
    //命令模式接口
    public abstract void execute() throws InterruptedException;

    public abstract Food getMyFood();
}

