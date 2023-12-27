package Command_new;

import Decorator_new.Book;
import Decorator_new.EnglishBook;
import Decorator_new.MathBook;

public class OrderEnglishBookCommand implements Command {
    //点单益肝青苔命令
    private final EnglishBook myEnglishBook = new EnglishBook();

    @Override
    public void execute() {
        System.out.println("点单:" + myEnglishBook.getDescription());
    }

    @Override
    public Book getMyBook() {
        return myEnglishBook;
    }
    @Override
    public int getPrice(){
        return  new EnglishBook().getPrice();
    }
}
