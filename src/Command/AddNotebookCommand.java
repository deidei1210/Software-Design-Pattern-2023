package Command;
import Decorator.StudyMaterialDecorator;
import Decorator.Book;
import Decorator.Notebook;
public class AddNotebookCommand implements Command {
    //添加配料胡椒粉
    private final Book myBook;

    public AddNotebookCommand(Book myBook) {
        this.myBook = myBook;
    }

    public void execute() {
        StudyMaterialDecorator addNotebook = new Notebook(myBook);
        System.out.println("点单:" + addNotebook.getDescription());
    }

    public Book getMyBook() {
        return myBook;
    }

    @Override
    public int getPrice(){
        return  23;
    }
}
