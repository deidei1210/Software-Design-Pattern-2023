package Bridge_new;

import FactoryMethod_new.Supplies;
import SimpleFactory_new.Student;

public abstract class studentSupply {
    private Bridge_new.supplyBuyer supplyBuyer;

    public studentSupply(Bridge_new.supplyBuyer supplyBuyer) {
        this.supplyBuyer = supplyBuyer;
    }

    //桥接后增加新的功能
    public void supplyBuy(Student student, Supplies supplies){
        supplyBuyer.buy(student, supplies);
    }
}
