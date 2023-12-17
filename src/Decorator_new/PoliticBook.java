package Decorator_new;

import Memento.Memento;

public class PoliticBook extends Book {
    //考研政治肖秀荣类（被装饰者）

    @Override
    public String getDescription() {
        return "考研政治肖秀荣" + studyMaterials;
    }

    public Memento createMemento() {
        return new Memento(this.studyMaterials);
    }

}
