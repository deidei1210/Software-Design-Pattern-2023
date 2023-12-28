package Bridge;

import FactoryMethod.Supplies;
import SimpleFactory.Student;

public interface SupplyBuyer {
    public void buy(Student student, Supplies supplies);
}
