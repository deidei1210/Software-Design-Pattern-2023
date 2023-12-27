package Command_new;

import Decorator_new.PoliticBook;
import Decorator_new.Book;

public class OrderPoliticBookCommand implements Command {
    //点单肉蛋葱鸡的命令
    private final PoliticBook myPoliticBook = new PoliticBook();

    @Override
    public void execute() {
        System.out.println("点单:" + myPoliticBook.getDescription());
    }

    @Override
    public Book getMyBook() {
        return myPoliticBook;
    }

    @Override
    public int getPrice() {
        return new PoliticBook().getPrice();
    }

}
