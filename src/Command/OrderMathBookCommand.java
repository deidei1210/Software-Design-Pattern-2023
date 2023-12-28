package Command;

import Decorator.MathBook;
import Decorator.Book;

public class OrderMathBookCommand implements Command {
    //点单数学资料的命令
    private final MathBook myMathBook = new MathBook();

    @Override
    public void execute() {
        System.out.println("点单:" + myMathBook.getDescription());
    }

    @Override
    public Book getMyBook() {
        return myMathBook;
    }

    @Override
    public int getPrice(){
        return  new MathBook().getPrice();
    }
}
