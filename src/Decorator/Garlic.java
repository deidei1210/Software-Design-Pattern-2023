package Decorator;

public class Garlic extends Food {
    //益肝青苔类（被装饰者）
    @Override
    public String getDescription() {
        return "益肝青苔" + condiment;
    }
}
