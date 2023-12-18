package Command_new;

import Decorator_new.MathBook;
import Decorator_new.Book;

public class OrderMathBookCommand implements Command {
    //点单填腹一饼的命令
    private final MathBook myMathBook = new MathBook();

    @Override
    public void execute() {
        System.out.println("点单:" + myMathBook.getDescription());
    }

    @Override
    public Book getMyBook() {
        return myMathBook;
    }
}
