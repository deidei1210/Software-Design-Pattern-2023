package Decorator_new;

public class Notebook extends StudyMaterialDecorator {
    //错题本类（装饰者）

    private int price=23; //错题本的价格

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public Notebook(Book book) {
        super(book);
        getMyBook().studyMaterials = getMyBook().studyMaterials + "+错题本";
    }

    @Override
    public String getDescription() {
        return "错题本";
    }

}
