package Decorator_new;

public class StudyMaterialDecorator extends Decorator_new.Book {
    //装饰者类

    private final Decorator_new.Book myBook;

    public StudyMaterialDecorator(Decorator_new.Book myBook) {
        this.myBook = myBook;
    }

    public Book getMyBook() {
        return myBook;
    }

    public String getDescription() {
        return "null";
    }

}
