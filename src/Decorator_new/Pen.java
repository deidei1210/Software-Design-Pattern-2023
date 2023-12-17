package Decorator_new;

public class Pen extends StudyMaterialDecorator {
    //水笔类（装饰者）
    public Pen(Book food) {
        super(food);
        getMyBook().studyMaterials = getMyBook().studyMaterials + "+水笔";
    }

    @Override
    public String getDescription() {
        return "水笔";
    }
}
