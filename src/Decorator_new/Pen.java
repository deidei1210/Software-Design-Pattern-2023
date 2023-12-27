package Decorator_new;

public class Pen extends StudyMaterialDecorator {
    //水笔类（装饰者）
    private int price=6; //水笔的价格

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public Pen(Book food) {
        super(food);
        getMyBook().studyMaterials = getMyBook().studyMaterials + "+水笔";
    }

    @Override
    public String getDescription() {
        return "水笔";
    }
}
