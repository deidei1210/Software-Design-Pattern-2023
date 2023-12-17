package Bridge_new;

import FactoryMethod_new.Supplies;
import SimpleFactory_new.Student;

public class BadSupply implements supplyBuyer {
    @Override
    public void buy(Student student, Supplies supplies) {
        System.out.println(student.getStudentName() + "购买了" +  supplies.getSupplyName() +" 物品，感觉效果不好");
    }
}
