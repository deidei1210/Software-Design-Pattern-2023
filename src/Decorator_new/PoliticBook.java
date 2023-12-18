package Decorator_new;

import Memento_new.Memento;

public class PoliticBook extends Book {
    //考研政治肖秀荣类（被装饰者）

    @Override
    public String getDescription() {
        return "考研政治肖秀荣" + studyMaterials;
    }

    public Memento_new.Memento createMemento() {
        return new Memento(this.studyMaterials);
    }

}
