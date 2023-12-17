package Decorator_new;

public class notebook extends StudyMaterialDecorator {
    //错题本类（装饰者）
    public notebook(Book book) {
        super(book);
        getMyBook().studyMaterials = getMyBook().studyMaterials + "+错题本";
    }

    @Override
    public String getDescription() {
        return "错题本";
    }

}