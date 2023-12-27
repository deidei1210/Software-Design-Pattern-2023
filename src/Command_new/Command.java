package Command_new;

import Decorator_new.Book;

public interface Command {
    //命令模式接口
    void execute() throws InterruptedException;

    Book getMyBook();

    int getPrice();
}

