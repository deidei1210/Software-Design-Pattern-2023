package Bridge;

import FactoryMethod.Supplies;
import SimpleFactory.Student;

public class PerfectSupply implements SupplyBuyer {
    @Override
    public void buy(Student student, Supplies supplies) {
        System.out.println(student.getStudentName() + "购买了" +  supplies.getSupplyName() +" 物品，感觉很好");
    }
}
