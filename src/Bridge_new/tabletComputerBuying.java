package Bridge_new;

import FactoryMethod_new.Supplies;
import SimpleFactory_new.Student;

public class tabletComputerBuying extends studentSupply {
    public tabletComputerBuying(Bridge_new.supplyBuyer supplyBuyer) {
        super(supplyBuyer);
    }

    @Override
    public void supplyBuy(Student student, Supplies supplies)  {
        super.supplyBuy(student, supplies);
        student.setReaction(student.getReaction() + 3);
        student.setHandspeed(student.getHandspeed() + 2);
    }
}
