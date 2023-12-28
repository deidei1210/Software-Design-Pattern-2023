package Decorator;

public class StudyMaterialDecorator extends Decorator.Book {
    //装饰者类

    private final Decorator.Book myBook;

    public StudyMaterialDecorator(Decorator.Book myBook) {
        this.myBook = myBook;
    }

    public Book getMyBook() {
        return myBook;
    }

    public String getDescription() {
        return "null";
    }

}
