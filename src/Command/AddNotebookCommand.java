package Command;
import Decorator.StudyMaterialDecorator;
import Decorator.Book;
import Decorator.Notebook;

/**
 * @param myBook 添加配料胡椒粉
 */
public record AddNotebookCommand(Book myBook) implements Command {

    public void execute() {
        StudyMaterialDecorator addNotebook = new Notebook(myBook);
        System.out.println("点单:" + addNotebook.getDescription());
    }

    @Override
    public int getPrice() {
        return 23;
    }
}
