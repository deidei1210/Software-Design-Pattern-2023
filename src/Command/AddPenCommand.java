package Command;

import Decorator.StudyMaterialDecorator;
import Decorator.Book;
import Decorator.Pen;

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

    public Book myBook() {
        return addPen;
    }

    @Override
    public int getPrice(){
        return  6;
    }
}
