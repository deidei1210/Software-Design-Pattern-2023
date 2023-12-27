package Decorator_new;

import Decorator_new.Book;

public class MathBook extends Book {
    //2025考研数学武忠祥类（被装饰者）

    private int price=50; //数学书的价格

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "2025考研数学武忠祥" + studyMaterials;
    }
}
