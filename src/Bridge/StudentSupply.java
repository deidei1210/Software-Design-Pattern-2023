package Bridge;

import FactoryMethod.Supplies;
import SimpleFactory.Student;

public abstract class StudentSupply {
    private SupplyBuyer supplyBuyer;

    public StudentSupply(SupplyBuyer supplyBuyer) {
        this.supplyBuyer = supplyBuyer;
    }

    //桥接后增加新的功能
    public void supplyBuy(Student student, Supplies supplies){
        supplyBuyer.buy(student, supplies);
    }
}
