package Command_new;

import Decorator_new.StudyMaterialDecorator;
import Decorator_new.Book;
import Decorator_new.Card;

public class AddCardCommand implements Command {
    //添加配料白砂糖
    private final Book myBook;

    public AddCardCommand(Book myBook) {
        this.myBook = myBook;
    }

    public void execute() {
        StudyMaterialDecorator addCard = new Card(myBook);
        System.out.println("点单:" + addCard.getDescription());
    }

    public Book getMyBook() {
        return myBook;
    }
}
