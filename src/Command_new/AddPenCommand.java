package Command_new;

import Decorator_new.Card;
import Decorator_new.StudyMaterialDecorator;
import Decorator_new.Book;
import Decorator_new.Pen;

public class AddPenCommand implements Command {
    //添加配料牛奶
    private final Book myBook;

    private StudyMaterialDecorator addPen;

    public AddPenCommand(Book myBook) {
        this.myBook = myBook;
    }

    public void execute() {
        addPen = new Pen(myBook);
        System.out.println("点单:" + addPen.getDescription());
    }

    public Book getMyBook() {
        return addPen;
    }

    @Override
    public int getPrice(){
        return  6;
    }
}
