package Decorator_new;

public class card extends StudyMaterialDecorator {
    //模拟答题卡类（装饰者）
    public card(Book book) {
        super(book);
        getMyBook().studyMaterials = getMyBook().studyMaterials+ "+模拟答题卡";
    }

    @Override
    public String getDescription() {
        return "模拟答题卡";
    }

}
