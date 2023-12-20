package Bridge_new;

import FactoryMethod_new.Supplies;
import SimpleFactory_new.Student;

public class studyChairBuying extends studentSupply {
    public studyChairBuying(Bridge_new.supplyBuyer supplyBuyer) {
        super(supplyBuyer);
    }

    @Override
    public void supplyBuy(Student student, Supplies supplies)  {
        super.supplyBuy(student, supplies);
        student.setHandspeed(student.getHandspeed() + 3);
        student.setEndurance(student.getEndurance() + 2);
    }
}
