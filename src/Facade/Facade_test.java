package Facade;


public class Facade_test {
    public static void main(String[] args) {
        System.out.println("外观模式（Facade Pattern）");
        System.out.println("包:Facade");
        System.out.println("类：Facade");
        System.out.println("实现接口：facade.method()");
        System.out.println("测试信息：");
        ExamFacade facade = new ExamFacade();
        facade.method();
        System.out.println("测试完成！");
        System.out.println();
    }

}
