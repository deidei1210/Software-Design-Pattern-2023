package Command;

import Decorator.Book;
import Decorator.EnglishBook;

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
