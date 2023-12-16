package SimpleFactory_new;

// 客户端调用
public class Main {
    public static void main(String[] args) {
        StudentFactory studentFactory = new StudentFactory();

        // 创建本科生
        Student undergraduate = studentFactory.createStudent("Undergraduate");
        undergraduate.register();

        // 创建研究生
        Student graduate = studentFactory.createStudent("Graduate");
        graduate.register();

        // 创建博士生
        Student phd = studentFactory.createStudent("PhD");
        phd.register();
    }
}
