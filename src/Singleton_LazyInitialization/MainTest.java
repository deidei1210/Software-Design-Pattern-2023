package Singleton_LazyInitialization;

import AbstractFactory.Teacher;
import AbstractFactory.TeacherStore;
import Adapter.AliAdapter;
import Bridge.PerfectSupply;
import Bridge.ReadingLampBuying;
import Bridge.StudentSupply;
import Bridge.SupplyBuyer;
import Builder.Exam;
import Builder.ExamsBuilder;
import Command.AddCardCommand;
import Command.AddPenCommand;
import Command.Command;
import Command.OrderMathBookCommand;
import Command.CCommandFn;
import DAO.StudentDao;
import DAO.StudentDaoImpl;
import Decorator.Book;
import FactoryMethod.ReadingLampFactory;
import FactoryMethod.Supplies;
import FactoryMethod.TabletComputerFactory;
import Iterator.ExamContainer;
import Iterator.StudentContainer;
import MVC.StudentController;
import MVC.StudentView;
import Memento.*;
import Composite.Menu;
import Composite.MenuOption;
import Facade.ExamFacade;
import Filter.Criteria;
import Filter.SECriteria;
import Interpreter.ExchangePrice;
import Interpreter.OriginalPrice;
import Interpreter.Price;
import Mediator.ConcretePlayer;
import Mediator.ConcreteMediator;
import Mediator.ConcreteOthers;
import NullObject.AbstractCustomer;
import NullObject.CustomerFactory;
import Flyweight.AttributeFactory;
import Observer.ScoreSubject;
import Prototype.EnglishMember;
import Proxy.ProxyScoreSheet;
import Proxy.ScoreSheet;
import Servant.Preparation;
import SimpleFactory.Student;
import SimpleFactory.StudentFactory;
import TransferObject.StudentBO;
import Visitor.VisitorFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class MainTest {
    //单例模式
    private static final MainTest instance = new MainTest();
    private MainTest() { }
    public static MainTest getInstance() {
        return instance;
    }

    //测试流程控制器
    public void TestController() throws InterruptedException {
        SingletonTest();
        SimpleFactoryTest();
        IteratorTest();
        AbstractFactoryTest();
        BuilderTest();
        FacadeTest();
        CompositeTest();
        TemplateTest();
        StrategyTest();
        StateTest();
        ObserverTest();
        CommandTest();
        MementoTest();
        FactoryMethodTest();
        BridgeTest();
        DecoratorTest();
        MediatorTest();
        ProxyTest();
        FlyweightTest();
        PrototypeTest();
        VisitorTest();
        ChainOfResponsibilityTest();
        LazyInitializationTest();
        MVCTest();
        TransferObjectTest();
        NullObjectTest();
        ServantTest();
        DaoTest();
        FilterTest();
        AdapterTest();
        InterpreterTest();

    }

    public static void waitForEnter() {
        System.out.println("请按回车继续...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    //1 单例模式（Singleton Pattern）
    //对单例模式的测试，该模式完成的是系统过程的模拟
    public void SingletonTest() {
        System.out.println("1 单例模式（Singleton Pattern）");
        System.out.println("包:Singleton_LazyInitialization");
        System.out.println("类：PeakPostgraduateEntranceExamCloud");
        System.out.println("实现接口：PeakPostgraduateEntranceExamCloud.getInstance()");
        System.out.println("测试信息：");
        PeakPostgraduateEntranceExamCloud.getInstance().showMessage();
        System.out.println();
        waitForEnter();
    }

    //2 简单工厂模式（Simple Factory Pattern）
    //简单工厂模式的测试，该模式主要实现的是学生的注册
    public void SimpleFactoryTest() {
        System.out.println("2 简单工厂模式（Simple Factory Pattern）");
        System.out.println("包:SimpleFactory");
        System.out.println("类：StudentFactory");
        System.out.println("实现接口：StudentFactory.createStudent(String targetMajor,String educationalLevel)");
        System.out.println("测试信息：");
        Student student = StudentFactory.createStudent("Software Engineering", "Undergraduate");
        System.out.println("学生注册成功！");
        student.showStudentInfo();
        StudentContainer.getInstance().add(student);
        System.out.println();
        waitForEnter();
    }

    //3 迭代器模式（Iterator Pattern）
    //迭代器模式的测试，该模式主要实现的是学生的注册
    public void IteratorTest() {
        System.out.println("3 迭代器模式（Iterator Pattern）");
        System.out.println("包:Iterator");
        System.out.println("类：StudentContainer");
        System.out.println("实现接口：StudentContainer.getInstance()");
        System.out.println("测试信息：");
        StudentFactory playerFactory = new StudentFactory();
        StudentContainer.getInstance().add(StudentFactory.createStudent("Software Engineering", "Undergraduate"));
        StudentContainer.getInstance().add(StudentFactory.createStudent("Artificial Intelligence", "Undergraduate"));
        StudentContainer.getInstance().add(StudentFactory.createStudent("Computer Science", "Graduate"));
        StudentContainer.getInstance().add(StudentFactory.createStudent("Other", "Undergraduate"));
        StudentContainer.getInstance().add(StudentFactory.createStudent("Software Engineering", "Graduate"));
        StudentContainer.getInstance().add(StudentFactory.createStudent("Computer Science", "Undergraduate"));
        StudentContainer.getInstance().add(StudentFactory.createStudent("Artificial Intelligence", "Undergraduate"));
        ArrayList<Student> students = StudentContainer.getInstance().getstudents();
        if (!students.isEmpty()) {
            System.out.println("学生列表获取成功！");
            for (Student athlete : students) {
                athlete.showStudentInfo();
            }
        } else {
            System.out.println("学生列表获取失败！");
        }
        System.out.println();
        waitForEnter();
    }

    //4 抽象工厂模式（Abstract Factory Pattern）
    public void AbstractFactoryTest() {
        System.out.println("4 抽象工厂模式（Abstract Factory Pattern）");
        System.out.println("包:AbstractFactory");
        System.out.println("类：TeacherStore");
        System.out.println("实现接口：teacher = TeacherStore.getInstance().orderTeacher(String TeacherName)");
        System.out.println("测试信息：");
        Teacher teacher = TeacherStore.getInstance().orderTeacher("高等数学命题组");
        teacher.setTeacherName("高等数学命题组");
        System.out.println("教师命题组创建成功！");
        System.out.println("教师命题组名称：" + teacher.getTeacherName());
        System.out.println();
        waitForEnter();
    }

    //5 建造者模式（Builder Pattern）
    public void BuilderTest() {
        System.out.println("5 建造者模式（Builder Pattern）");
        System.out.println("包:Builder");
        System.out.println("类：ExamsBuilder");
        System.out.println("实现接口：ExamsBuilder.getInstance().buildExams()");
        System.out.println("测试信息：");
        ExamsBuilder.getInstance().buildExams();
        if (!ExamContainer.getInstance().getExams().isEmpty()) {
            System.out.println("考试创建成功！");
            for (Exam game : ExamContainer.getInstance().getExams()) {
                game.showExamInfo();
            }
        } else {
            System.out.println("考试创建失败！");
        }
        System.out.println();
        waitForEnter();
    }

    //6 外观模式（Facade Pattern）
    public void FacadeTest() {
        System.out.println("6 外观模式（Facade Pattern）");
        System.out.println("包:Facade");
        System.out.println("类：Facade");
        System.out.println("实现接口：facade.method()");
        System.out.println("测试信息：");
        ExamFacade facade = new ExamFacade();
        facade.method();
        System.out.println("学生检录完成！");
        System.out.println();
        waitForEnter();
    }

    //7 组合模式（Composite Pattern）
    public void CompositeTest() {
        System.out.println("7 组合模式（Composite Pattern）");
        System.out.println("包:Composite");
        System.out.println("类：MenuOption");
        System.out.println("实现接口：printMenu()");
        System.out.println("测试信息：");
        //设置测试用菜单
        Menu rootMenu = new Menu("系统功能体验选择");
        //第一个考试菜单
        Menu examMenu = new Menu("考试");
        //创建三个比赛实例
        int element = 0;
        MenuOption advancedMath = new MenuOption("高等数学", ExamContainer.getInstance().get(0));
        MenuOption collegeEnglish = new MenuOption("大学英语", ExamContainer.getInstance().get(1));
        MenuOption collegePolitics = new MenuOption("大学政治", ExamContainer.getInstance().get(2));
        MenuOption computerBasics = new MenuOption("计算机408", ExamContainer.getInstance().get(3));
        // 向考试菜单中添加4个选项
        // 可在此处创建4个比赛实例替换 Add 中参数 element  后续同理
        examMenu.add(advancedMath);
        examMenu.add(collegeEnglish);
        examMenu.add(collegePolitics);
        examMenu.add(computerBasics);

        MenuOption materialMarket = new MenuOption("顶峰教辅超市", CCommandFn.getInstance());
        MenuOption queryRank = new MenuOption("查询模拟考试竞争对手成绩", element);
        MenuOption buyEquipment = new MenuOption("购买学习辅助神器", element);
        MenuOption printRank = new MenuOption("打印最终结果成绩单", element);
        MenuOption studyInStudyGroup = new MenuOption("进入学习小组学习", element);
        rootMenu.add(examMenu);
        rootMenu.add(materialMarket);
        rootMenu.add(queryRank);
        rootMenu.add(buyEquipment);
        rootMenu.add(printRank);
        rootMenu.add(studyInStudyGroup);
        // 菜单以及选择返回
        System.out.println("打印一级菜单：");
        rootMenu.printMenu();
        System.out.println("打印二级菜单：");
        examMenu.printMenu();
        System.out.println();
        waitForEnter();
    }

    //8 模板模式（Template Pattern）
    public void TemplateTest() {
        System.out.println("8 模板模式（Template Pattern）");
        System.out.println("包:Template_Strategy");
        System.out.println("类：AdvancedMath/CollegeEnglish/CollegePolitics/ComputerBasics");
        System.out.println("实现接口：exam.showExamInfo()");
        System.out.println("测试信息：");
        for (Exam exam : ExamContainer.getInstance().getExams()) {
            exam.showExamInfo();
        }
        System.out.println();
        waitForEnter();
    }

    //9 策略模式（Strategy Pattern）
    public void StrategyTest() {
        System.out.println("9 策略模式（Strategy Pattern）");
        System.out.println("包:Template_Strategy");
        System.out.println("类：AdvancedMath/CollegeEnglish/CollegePolitics/ComputerBasics");
        System.out.println("实现接口：exam.examStart()");
        System.out.println("测试信息：");
        for (int i = 0; i < 4; ++i) {
            ExamContainer.getInstance().get(i).examStart();
            ExamContainer.getInstance().get(i).examEnd();
        }
        System.out.println();
        waitForEnter();
    }

    //10 状态模式（State Pattern）
    public void StateTest() {
        System.out.println("10 状态模式（State Pattern）");
        System.out.println("包:State");
        System.out.println("类：StudentState");
        System.out.println("实现接口：student.getStudentState()");
        System.out.println("测试信息：");
        System.out.println("当前状态：" + StudentContainer.getInstance().get(0).getStudentState().toString());
        System.out.println();
        waitForEnter();
    }

    //11 观察者模式（Observer Pattern）
    public void ObserverTest() {
        System.out.println("11 观察者模式（Observer Pattern）");
        System.out.println("包:Observer");
        System.out.println("类：StudentObserver");
        System.out.println("实现接口：ScoreSubject.getInstance().notifyObserver(int game, int[] rank, double[] score)");
        System.out.println("测试信息：");
        Student student = StudentContainer.getInstance().get(0);
        System.out.println("原始数据：");

        //TODO:尚待思考怎么写
        // 获取第一个学生的实例
        student = StudentContainer.getInstance().get(0);
        System.out.println("原始数据：");
        System.out.println("学生排名：" + Arrays.toString(student.getRank()));
        System.out.println("学生分数：" + Arrays.toString(student.getScore()));

        // 模拟考试排名和分数的变化
        int game = 1; // 假设是第一个考试
        int[] rank = new int[] {2}; // 假设学生的新排名是2
        double[] score = new double[] {95.0}; // 假设学生的新分数是95.0

        // 通知观察者（学生）关于排名和分数的变化
        ScoreSubject.getInstance().notifyObserver(game, rank, score);

        // 检查更新后的数据
        System.out.println("更新后的数据：");
        System.out.println("学生排名：" + Arrays.toString(student.getRank()));
        System.out.println("学生分数：" + Arrays.toString(student.getScore()));


        waitForEnter();
    }

    //12 命令模式（Command Pattern）
    public void CommandTest() throws InterruptedException {
        System.out.println("12 命令模式（Command Pattern）");
        System.out.println("包:Command_Memento");
        System.out.println("类：Command");
        System.out.println("实现接口：Command.execute()");
        System.out.println("测试信息：");
        CareTaker orderList = new CareTaker();
        Command orderMathBook = new OrderMathBookCommand();
        orderMathBook.execute();
        Book myMathBook = orderMathBook.myBook();
        orderList.append(orderMathBook, myMathBook.createMemento());
        System.out.println("你的点单: " + myMathBook.getDescription());
        System.out.println();
        waitForEnter();
    }

    //13 装饰器模式（Decorator Pattern）
    public void DecoratorTest() throws InterruptedException {
        System.out.println("13 装饰器模式（Decorator Pattern）");
        System.out.println("包:Decorator");
        System.out.println("类：CondimentDecorator");
        System.out.println("实现接口：CondimentDecorator.getMyFood()");
        System.out.println("测试信息：");
        CareTaker orderList = new CareTaker();
        Command orderMathBook = new OrderMathBookCommand();
        orderMathBook.execute();
        Book myMathBook = orderMathBook.myBook();
        orderList.append(orderMathBook, myMathBook.createMemento());
        Command addPen = new AddPenCommand(myMathBook);
        addPen.execute();
        orderList.append(addPen, myMathBook.createMemento());
        Command addCard = new AddCardCommand(myMathBook);
        addCard.execute();
        orderList.append(addCard, myMathBook.createMemento());
        System.out.println("你的点单: " + myMathBook.getDescription());
        System.out.println();
        waitForEnter();

    }

    //14 备忘录模式（Memento Pattern）
    public void MementoTest() throws InterruptedException {
        System.out.println("14 备忘录模式（Memento Pattern）");
        System.out.println("包:Command_Memento");
        System.out.println("类：CareTaker");
        System.out.println("实现接口：CareTaker.undo()/CareTaker.redo()");
        System.out.println("测试信息：");
        CareTaker orderList = new CareTaker();
        Command orderPancake = new OrderMathBookCommand();
        orderPancake.execute();
        Book myMathBook = orderPancake.myBook();
        orderList.append(orderPancake, myMathBook.createMemento());
        Command addPen = new AddPenCommand(myMathBook);
        addPen.execute();
        orderList.append(addPen, myMathBook.createMemento());
        System.out.println("你目前的点单为:" + myMathBook.getDescription());
        System.out.println("Order:撤销");
        orderList.undo();
        System.out.println("你目前的点单为:" + myMathBook.getDescription());
        System.out.println("Order:重做");
        orderList.redo();
        System.out.println("你目前的点单为:" + myMathBook.getDescription());
        Command addCard = new AddCardCommand(myMathBook);
        addCard.execute();
        orderList.append(addCard, myMathBook.createMemento());
        System.out.println("你最终点单为: " + myMathBook.getDescription());
        System.out.println();
        waitForEnter();

    }

    //15 工厂方法模式（Factory Method Pattern）
    public void FactoryMethodTest() {
        System.out.println("15 工厂方法模式（Factory Method Pattern）");
        System.out.println("包:FactoryMethod");
        System.out.println("类：MousePeripheralFactory");
        System.out.println("实现接口：ISupplyFactory.createSupply(Student owner)");
        System.out.println("测试信息：");
        Student student = StudentContainer.getInstance().get(0);
        TabletComputerFactory mouseFactory = new TabletComputerFactory();
        Supplies mouse = mouseFactory.createSupply(student);
        System.out.println("学习辅助工具创建成功！");
        System.out.println("辅助工具类型：" + mouse.getSupplyName());
        System.out.println();
        waitForEnter();
    }

    //16 桥接模式（Bridge Pattern）
    public void BridgeTest() {
        System.out.println("16 桥接模式（Bridge Pattern）");
        System.out.println("包:Bridge");
        System.out.println("类：SupplyBuyer");
        System.out.println("实现接口：PerfectSupply.SupplyBuyer(Student student, Supply supply)");
        System.out.println("测试信息：");
        Student student = StudentContainer.getInstance().get(0);
        ReadingLampFactory readingLampFactory = new ReadingLampFactory();
        Supplies readingLamp = readingLampFactory.createSupply(student);
        SupplyBuyer si = new PerfectSupply();
        StudentSupply supply = new ReadingLampBuying(si);
        supply.supplyBuy(student, readingLamp);
        System.out.println("使用前坚韧度：" + student.getEndurance());
        System.out.println("使用后坚韧度：" + student.getEndurance());
        System.out.println();
        waitForEnter();
    }

    //17 中介者模式（Mediator Pattern）
    public void MediatorTest() {
        System.out.println("17 中介者模式（Mediator Pattern）");
        System.out.println("包:Mediator");
        System.out.println("类：ConcreteMediator");
        System.out.println("实现接口：Others.send(String msg)");
        System.out.println("测试信息：");
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteOthers Others = new ConcreteOthers(mediator);
        ConcretePlayer player = new ConcretePlayer(mediator);
        mediator.setOthers(Others);
        mediator.setAthlete(player);
        Others.send("在购物中心偶遇其他用户，并为你加油打劲！");
        System.out.println();
        waitForEnter();
    }

    //18 代理模式（Proxy Pattern）
    public void ProxyTest() {
        System.out.println("18 代理模式（Proxy Pattern）");
        System.out.println("包:Proxy");
        System.out.println("类：ProxyScoreSheet");
        System.out.println("实现接口：ProxyScoreSheet.printScoreSheet()");
        System.out.println("测试信息：");
        ScoreSheet proxyScoreSheet = new ProxyScoreSheet();
        proxyScoreSheet.printScoreSheet();
        System.out.println();
        waitForEnter();
    }

    //19 享元模式（Flyweight Pattern）
    public void FlyweightTest() {
        System.out.println("19 享元模式（Flyweight Pattern）");
        System.out.println("包:Prototype_Flyweight");
        System.out.println("类：AttributeFactory");
        System.out.println("实现接口：AttributeFactory.setEDGAudience()");
        System.out.println("测试信息：");
        System.out.println("自习室创建成功！");
        EnglishMember englishMember = (EnglishMember) AttributeFactory.setMember("English","Tong ji");
//        englishMember.setAge(getRandomAge());
//        englishMember.setSex(getRandomSex());
        System.out.println();
        waitForEnter();

    }

    //20 原型模式（Prototype Pattern）
    public void PrototypeTest() {
        System.out.println("20 原型模式（Prototype Pattern）");
        System.out.println("包:Prototpye_Flyweight");
        System.out.println("类：AudienceCache");
        System.out.println("实现接口：AudienceCache.getAudience(String audienceId)");
        System.out.println("测试信息：");
        EnglishMember englishMember1 = (EnglishMember) AttributeFactory.setMember("English","Tong ji");
//        englishMember1.setAge(getRandomAge());
//        englishMember1.setSex(getRandomSex());
//        EDGFans1.printClub();
        System.out.println("Clone Successfully!");
        EnglishMember englishMember2 = (EnglishMember) AttributeFactory.setMember("English","Tong ji");
//        englishMember2.setAge(getRandomAge());
//        englishMember2.setSex(getRandomSex());
//        EDGFans2.printClub();
        System.out.println();
        waitForEnter();

    }

    //21 访问者模式（Visitor Pattern）
    public void VisitorTest() {
        System.out.println("21 访问者模式（Visitor Pattern）");
        System.out.println("包:Visitor");
        System.out.println("类：Visitor");
        System.out.println("实现接口：Visitor.getAudience(String audienceId)");
        System.out.println("测试信息：");
        VisitorFunction.visitorFunction(0, ExamContainer.getInstance().get(0));
        System.out.println();
        waitForEnter();

    }

    //22 责任链模式（Chain Of Responsibility Pattern）
    public void ChainOfResponsibilityTest() {
        System.out.println("22 责任链模式（Chain Of Responsibility Pattern）");
        System.out.println("包:ChainOfResponsibility");
        System.out.println("类：AbstractOpponent");
        System.out.println("实现接口：AbstractOpponent.fight()");
        System.out.println("测试信息：");
        ExamContainer.getInstance().get(3).examStart();
        ExamContainer.getInstance().get(3).examEnd();
        System.out.println();
        waitForEnter();

    }

    //23 延迟初始化模式（Lazy Initialization Pattern）
    public void LazyInitializationTest() {
        System.out.println("23 延迟初始化模式（Lazy Initialization Pattern）");
        System.out.println("包:Singleton_LazyInitialization");
        System.out.println("类：PeakPostgraduateEntranceExamCloud");
        System.out.println("实现接口：PeakPostgraduateEntranceExamCloud()");
        System.out.println("测试信息：");
        System.out.println("静态初始化器，通过JVM来保证线程安全");
        PeakPostgraduateEntranceExamCloud.getInstance().showMessage();
        System.out.println();
        waitForEnter();

    }

    //24 MVC模式（MVC Pattern）
    public void MVCTest() {
        System.out.println("24 MVC模式（MVC Pattern）");
        System.out.println("包:MVC");
        System.out.println("类：StudentController");
        System.out.println("实现接口：StudentController.updateView()");
        System.out.println("测试信息：");
        Student student = StudentFactory.createStudent("Software Engineering", "Graduate");
        StudentView views = new StudentView();
        StudentController controller = new StudentController(student, views);
        controller.updateView();
        System.out.println("修改姓名为：JieJie");
        controller.setStudentName("JieJie");
        controller.updateView();
        System.out.println();
        waitForEnter();
    }

    //25 传输对象模式（Transfer Object Pattern）
    public void TransferObjectTest() {
        System.out.println("25 传输对象模式（Transfer Object Pattern）");
        System.out.println("包:TransferObject");
        System.out.println("类：StudentBO");
        System.out.println("实现接口：PlayerBO.getStudent(int rollNo)");
        System.out.println("测试信息：");
        StudentBO studentBO = new StudentBO();
        System.out.println("当前考试学生列表：");
        for (Student student : studentBO.getAllStudents()) {
            System.out.println("名字: " + student.getStudentName());
        }
        studentBO.deleteStudent(studentBO.getStudent(2));
        System.out.println("当前参赛成员列表：");
        for (Student student : studentBO.getAllStudents()) {
            System.out.println("名字: " + student.getStudentName());
        }
        Student student = StudentFactory.createStudent("Software Engineering", "Graduate");
        studentBO.updateStudent(student);
        System.out.println("当前参赛成员列表：");
        for (Student animals : studentBO.getAllStudents()) {
            System.out.println("名字: " + animals.getStudentName());
        }
        System.out.println();
        waitForEnter();
    }

    //26 空对象模式（Null Object Pattern）
    public void NullObjectTest() {
        System.out.println("26 空对象模式（Null Object Pattern）");
        System.out.println("包:NullObject");
        System.out.println("类：NullCustomer");
        System.out.println("实现接口：abstractCustomer.getName()");
        System.out.println("测试信息：");
        AbstractCustomer abstractCustomer;
        CustomerFactory customerFactory = new CustomerFactory();
        abstractCustomer = customerFactory.getCustomer("ChinaIG");
        boolean result = abstractCustomer.isNil();
        if (!result) {
            System.out.println("该名称存在，名称为：");
            System.out.println(abstractCustomer.getName());
        } else {
            System.out.println("名称不存在");
            System.out.println(abstractCustomer.getName());
        }
        abstractCustomer = customerFactory.getCustomer("JapanRNG");
        result = abstractCustomer.isNil();
        if (!result) {
            System.out.println("该名称存在，名称为：");
            System.out.println(abstractCustomer.getName());
        } else {
            System.out.println("名称不存在");
            System.out.println(abstractCustomer.getName());
        }
        System.out.println();
        waitForEnter();
    }

    //27 雇工模式（Servant Pattern）
    public void ServantTest() {
        System.out.println("27 雇工模式（Servant Pattern）");
        System.out.println("包:Servant");
        System.out.println("类：Worker");
        System.out.println("实现接口：Worker.prepare(Preparation game)");
        System.out.println("测试信息：");
        Preparation exam = (Preparation) ExamContainer.getInstance().get(0);
        exam.examPreparation();
        System.out.println();
        waitForEnter();
    }

    //28 DAO模式（DAO Pattern）
    public void DaoTest() {
        System.out.println("28 DAO模式（DAO Pattern）");
        System.out.println("包:DAO");
        System.out.println("类：StudentDaoImpl");
        System.out.println("实现接口：StudentDaoImpl.getAllStudents()");
        System.out.println("测试信息：");
        StudentDao studentDao = new StudentDaoImpl();
        //输出所有的运动员
        for (DAO.Student student : studentDao.getAllStudents()) {
            System.out.println("编号 : "
                    + student.getRollNo() + ", 姓名 : " + student.getName());
        }
        //更新运动员
        DAO.Student student = studentDao.getAllStudents().get(0);
        student.setName("ShowMaker");
        studentDao.updateStudent(student);
        //获取运动员
        studentDao.getStudent(0);
        System.out.println("编号 : "
                + student.getRollNo() + ", 姓名 : " + student.getName());
        System.out.println();
        waitForEnter();
    }

    //29 过滤器模式（Filter Pattern）
    public void FilterTest() {
        System.out.println("29 过滤器模式（Filter Pattern）");
        System.out.println("包:Filter");
        System.out.println("类：Criteria");
        System.out.println("实现接口：EDGCriteria.meetCriteria(ArrayList<Student> studentList)");
        System.out.println("测试信息：");
        ArrayList<Student> studentArrayList;
        studentArrayList = StudentContainer.getInstance().getstudents();
        Criteria seCriteria = new SECriteria();
        System.out.println("Before Filtering:");
        for (Student student : studentArrayList) {
            System.out.println(student.getStudentTargetMajor() +"  "+ student.getStudentEducationalLevel()+ ":" + student.getStudentName());
        }
        ArrayList<Student> filterList = seCriteria.meetCriteria(studentArrayList);
        System.out.println("After Filtering(SE):");
        for (Student student : filterList) {
            System.out.println(student.getStudentTargetMajor() +"  "+ student.getStudentEducationalLevel()+ ":" + student.getStudentName());
        }
        System.out.println();
        waitForEnter();
    }

    //30 适配器模式（Adapter Pattern）
    public void AdapterTest() {
        System.out.println("30 适配器模式（Adapter Pattern）");
        System.out.println("包:AliAdapter");
        System.out.println("类：Criteria");
        System.out.println("实现接口：AliAdapter().pay()");
        System.out.println("测试信息：");
        new AliAdapter().pay(1000);
        System.out.println();
        waitForEnter();
    }

    //31 解释器模式（Interpreter Pattern）
    public void InterpreterTest() {
        System.out.println("31 解释器模式（Interpreter Pattern）");
        System.out.println("包:Interpreter");
        System.out.println("类：ExchangePrice");
        System.out.println("实现接口：ExchangePrice.Method()");
        System.out.println("测试信息：");
        Price price = new Price();
        price.SetOriPrice(10f);
        System.out.println("已设置原价为10");
        price.SetExchange(10f);
        System.out.println("已设置汇率为1：10");
        OriginalPrice oriPriceInterpreter = new OriginalPrice();
        System.out.println("设置OriginalPrice解释器，解析价格，输出原价：");
        float result = oriPriceInterpreter.Method(price);
        System.out.println("原价为：" + result);
        ExchangePrice discountPriceInterpreter = new ExchangePrice();
        System.out.println("设置DiscountPrice解释器，解析价格，输出转换价：");
        result = discountPriceInterpreter.Method(price);
        System.out.println("折扣价为：" + result);
        System.out.println();
        waitForEnter();
    }

}
