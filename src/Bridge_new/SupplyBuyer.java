package Bridge_new;

import FactoryMethod_new.Supplies;
import SimpleFactory_new.Student;

public interface SupplyBuyer {
    public void buy(Student student, Supplies supplies);
}
