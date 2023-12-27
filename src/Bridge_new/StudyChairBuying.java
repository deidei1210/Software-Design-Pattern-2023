package Bridge_new;

import FactoryMethod_new.Supplies;
import SimpleFactory_new.Student;

public class StudyChairBuying extends StudentSupply {
    public StudyChairBuying(SupplyBuyer supplyBuyer) {
        super(supplyBuyer);
    }

    @Override
    public void supplyBuy(Student student, Supplies supplies)  {
        super.supplyBuy(student, supplies);
        student.setMemoryAbility(student.getMemoryAbility() + 3);
        student.setEndurance(student.getEndurance() + 2);
    }
}
