package Bridge_new;

import FactoryMethod_new.Supplies;
import SimpleFactory_new.Student;

public interface supplyBuyer {
    public void buy(Student student, Supplies supplies);
}
