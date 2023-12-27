package Bridge_new;

import FactoryMethod_new.Supplies;
import SimpleFactory_new.Student;

public class TabletComputerBuying extends StudentSupply {
    public TabletComputerBuying(SupplyBuyer supplyBuyer) {
        super(supplyBuyer);
    }

    @Override
    public void supplyBuy(Student student, Supplies supplies)  {
        super.supplyBuy(student, supplies);
        student.setReaction(student.getReaction() + 3);
        student.setMemoryAbility(student.getMemoryAbility() + 2);
    }
}
