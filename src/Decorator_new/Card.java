package Decorator_new;

public class Card extends StudyMaterialDecorator {
    //模拟答题卡类（装饰者）
    public Card(Book book) {
        super(book);
        getMyBook().studyMaterials = getMyBook().studyMaterials+ "+模拟答题卡";
    }

    @Override
    public String getDescription() {
        return "模拟答题卡";
    }

}
