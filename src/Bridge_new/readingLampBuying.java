package Bridge_new;

import FactoryMethod_new.Supplies;
import SimpleFactory_new.Student;

public class readingLampBuying extends studentSupply {
    public readingLampBuying(Bridge_new.supplyBuyer supplyBuyer) {
        super(supplyBuyer);
    }

    //等待dtt决定好采用的属性值
    @Override
    public void supplyBuy(Student student, Supplies supplies) {
        super.supplyBuy(student, supplies);
//        Student.setReaction(Student.getReaction() + 3);
//        Student.setEndurance(Student.getEndurance() + 2);
    }
}