package Decorator_new;

import Decorator_new.Book;

public class MathBook extends Book {
    //2025考研数学武忠祥类（被装饰者）
    @Override
    public String getDescription() {
        return "2025考研数学武忠祥" + studyMaterials;
    }
}
