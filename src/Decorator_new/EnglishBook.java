package Decorator_new;

public class EnglishBook extends Book {
    //考研英语红宝书类（被装饰者）
    @Override
    public String getDescription() {
        return "考研英语红宝书" + studyMaterials;
    }
}
