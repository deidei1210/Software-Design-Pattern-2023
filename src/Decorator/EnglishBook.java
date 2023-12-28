package Decorator;

public class EnglishBook extends Book {
    //考研英语红宝书类（被装饰者）

    private int price=100; //英语书的价格
    @Override
    public String getDescription() {
        return "考研英语红宝书" + studyMaterials;
    }

    //获取英语书的价格
    public int getPrice() {
        return price;
    }
    //设置英语书的价格
    public void setPrice(int price) {
        this.price = price;
    }
}
