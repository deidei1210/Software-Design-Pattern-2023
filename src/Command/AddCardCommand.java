package Command;
import Decorator.StudyMaterialDecorator;
import Decorator.Book;
import Decorator.Card;

public class AddCardCommand implements Command {
    //添加配料白砂糖
    private final Book myBook;
    StudyMaterialDecorator addCard;

    public AddCardCommand(Book myBook) {
        this.myBook = myBook;
        this.addCard=new Card(myBook);
    }

    public void execute() {

        System.out.println("点单:" + addCard.getDescription());
    }

    public Book myBook() {
        return myBook;
    }

    @Override
    public int getPrice(){
        return 9;
    }
}
