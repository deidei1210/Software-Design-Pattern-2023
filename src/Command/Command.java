package Command;

import Decorator.Book;

public interface Command {
    //命令模式接口
    void execute() throws InterruptedException;

    Book myBook();

    int getPrice();
}

