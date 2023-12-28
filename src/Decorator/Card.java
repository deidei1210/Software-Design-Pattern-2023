package Decorator;

public class Card extends StudyMaterialDecorator {
    //模拟答题卡类（装饰者）
    private int price=9; //答题卡的价格

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public Card(Book book) {
        super(book);
        getMyBook().studyMaterials = getMyBook().studyMaterials+ "+模拟答题卡";
    }

    @Override
    public String getDescription() {
        return "模拟答题卡";
    }

}
