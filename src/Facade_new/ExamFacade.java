package Facade_new;

// 外观类
public class ExamFacade {

    // 被委托的对象，报名、排队、体检、检录
    SignUp signUp;
    LineUp lineUp;
    InfoCheck infoCheck;
    CheckIn checkIn;

    // 外观设计模式创建新的报名、排队等过程
    public ExamFacade() {
        signUp = new SignUp();
        lineUp = new LineUp();
        infoCheck = new InfoCheck();
        checkIn = new CheckIn();
    }

    // 提供给外部访问的方法，完成整个考试流程
    public void method() {
        signUp.doSomething();
        lineUp.doSomething();
        infoCheck.doSomething();
        checkIn.doSomething();
    }
}
