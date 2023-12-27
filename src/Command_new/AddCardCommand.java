package Command_new;

//import Decorator_new.MathBook;
import Decorator_new.StudyMaterialDecorator;
import Decorator_new.Book;
import Decorator_new.Card;

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

    public Book getMyBook() {
        return myBook;
    }

    @Override
    public int getPrice(){
        return 9;
    }
}
