package Bridge;

import FactoryMethod.Supplies;
import SimpleFactory.Student;

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
