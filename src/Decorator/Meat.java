package Decorator;

import Memento.Memento;

public class Meat extends Food {
    //肉蛋葱鸡类（被装饰者）

    @Override
    public String getDescription() {
        return "肉蛋葱鸡" + condiment;
    }

    public Memento createMemento() {
        return new Memento(this.condiment);
    }

}
