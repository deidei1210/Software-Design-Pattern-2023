package NullObject;

import Iterator_new.StudentContainer;

import java.util.*;

public class CustomerFactory {

    private final ArrayList<String> names = new ArrayList<>();

    //将对象全部加入name中
    public CustomerFactory() {
        for (int i = 0; i < StudentContainer.getInstance().size(); ++i) {
            names.add(StudentContainer.getInstance().get(i).getStudentName());
        }
    }

    //基于参数name返回real和null对象
    public AbstractCustomer getCustomer(String name) {
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}