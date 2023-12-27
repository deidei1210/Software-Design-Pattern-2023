package Singleton_LazyInitialization;

import Builder_new.Exam;
import Builder_new.ExamsBuilder;

import Command_new.CCommandFn;
import Composite_new.MenuOption;
import Facade_new.ExamFacade;
import Mediator_new.CMediatorFn;
import Servant_new.Preparation;
import Servant_new.Worker;
import SimpleFactory_new.Student;
import SimpleFactory_new.StudentFactory;
import Iterator_new.ExamContainer;
import Iterator_new.StudentContainer;
import Composite_new.Menu;
import State_new.StateGood;
import State_new.StatePerfect;
import TemplateAndStrategy_new.AdvancedMath;
import TemplateAndStrategy_new.CollegeEnglish;
import TemplateAndStrategy_new.CollegePolitics;
import TemplateAndStrategy_new.ComputerBasics;
import Visitor_new.CVisitorFn;

import java.util.Scanner;

public class BoiledCodfishCarnivalWithCheese {

    //创建 Singleton.AnimalSportMeeting 的一个对象

    //让构造函数为 private，这样该类就不会被实例化
    private BoiledCodfishCarnivalWithCheese() {
    }

    public static BoiledCodfishCarnivalWithCheese getInstance() {
        return SingletonHolder.instance;
    }

    //测试信息
    public void showMessage() {
        System.out.println("ASM Created Successfully!");
    }

    //流程控制器
    public void flowController() throws CloneNotSupportedException {
        System.out.println("欢迎来到顶峰考研云在线考研模拟考试系统！");
        Scanner input = new Scanner(System.in);
        //学生注册
        System.out.println("请输入你的名字：");
        String name = input.nextLine();

        //选择你的考研目标专业
        System.out.println("选择你的目标专业 [1]Software Engineering [2]Computer Science [3]Artificial Intelligence [4]Other");
        int majorNum = input.nextInt();
        System.out.println("选择你的教育程度 [1]未毕业 [2]已毕业");
        int educationNum = input.nextInt();

        //选择的目标专业
        String major = "Software Engineering";
        String educationLevel = "Undergraduate";

        //根据用户的选择进行major的赋值
        switch (majorNum) {
            case 1:
                major = "Software Engineering";
                break;
            case 2:
                major = "Computer Science";
                break;
            case 3:
                major = "Artificial Intelligence";
                break;
            case 4:
                major = "Other";
                break;
            default:
                break;
        }
        //选择用户的教育程度：是否已经毕业？如果已经毕业则可能是二战，如果不是则是一战
        switch (educationNum) {
            case 1:
                educationLevel = "Undergraduate";
                break;
            case 2:
                educationLevel = "Graduate";
                break;
            default:
                break;
        }


//        StudentFactory studentFactory = new StudentFactory();
        Student student = StudentFactory.createStudent(major, educationLevel);
        student.setStudentName(name);//设置学生姓名
        StudentContainer.getInstance().add(student);
        //创建一起参加模拟考试的考生
        StudentContainer.getInstance().add(StudentFactory.createStudent("Software Engineering", "Undergraduate"));
        StudentContainer.getInstance().add(StudentFactory.createStudent("Artificial Intelligence", "Undergraduate"));
        StudentContainer.getInstance().add(StudentFactory.createStudent("Computer Science", "Graduate"));
        StudentContainer.getInstance().add(StudentFactory.createStudent("Other", "Undergraduate"));
        StudentContainer.getInstance().add(StudentFactory.createStudent("Software Engineering", "Graduate"));
        StudentContainer.getInstance().add(StudentFactory.createStudent("Computer Science", "Undergraduate"));
        StudentContainer.getInstance().add(StudentFactory.createStudent("Artificial Intelligence", "Undergraduate"));

        //创建考试项目
        ExamsBuilder.getInstance().buildExams();
        for (Exam exam : ExamContainer.getInstance().getExams()) {
            exam.showExamInfo();
        }
        //玩家检入
        ExamFacade facade = new ExamFacade();
        facade.method();
        //考试正式开始
        //设置测试用菜单
        Menu rootMenu = new Menu("系统功能选项");
        //第一个考试菜单
        Menu examMenu = new Menu("选择考试科目");
        //创建考试实例
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
        MenuOption queryRank = new MenuOption("询问成绩", element);
        MenuOption buyEquipment = new MenuOption("买外设", element);
        MenuOption printRank = new MenuOption("打印成绩单", element);
        MenuOption meetAudience = new MenuOption("粉丝见面会", element);
        rootMenu.add(examMenu);
        rootMenu.add(materialMarket);
        rootMenu.add(queryRank);
        rootMenu.add(buyEquipment);
        rootMenu.add(printRank);
        rootMenu.add(meetAudience);
        // 菜单以及选择返回
        rootMenu.printMenu();
        int i = input.nextInt();
        int examTaken = 0;
        while (i != 0) {
            switch (i) {
                //如果选择1，说明要进行模拟考试
                case 1: {
                    examMenu.printMenu();
                    Exam exam;
                    switch (input.nextInt()) {
                        //进行高等数学的考试
                        case 1:
                            exam = (AdvancedMath) (examMenu.getMenu().get(0).option);
                            if (exam.isTaken()) {
                                System.out.println("该考试已结束，请参加其他科目的模拟测试！");
                                break;
                            }
                            Worker worker1 = new Worker();
                            worker1.prepare((Preparation) exam);
                            exam.examStart();
                            exam.examEnd();
                            ++examTaken;
                            break;
                        //进行大学英语的考试
                        case 2:
                            exam = (CollegeEnglish) (examMenu.getMenu().get(1).option);
                            if (exam.isTaken()) {
                                System.out.println("该项目已结束，请参加其他项目！");
                                break;
                            }
                            Worker worker2 = new Worker();
                            worker2.prepare((Preparation) exam);
                            exam.examStart();
                            exam.examEnd();
                            ++examTaken;
                            break;
                        //进行大学政治的考试
                        case 3:
                            exam = (CollegePolitics) (examMenu.getMenu().get(2).option);
                            if (exam.isTaken()) {
                                System.out.println("该项目已结束，请参加其他项目！");
                                break;
                            }
                            Worker worker3 = new Worker();
                            worker3.prepare((Preparation) exam);
                            exam.examStart();
                            exam.examEnd();
                            ++examTaken;
                            break;
                        //进行408考试
                        case 4:
                            exam = (ComputerBasics) (examMenu.getMenu().get(3).option);
                            if (exam.isTaken()) {
                                System.out.println("该项目已结束，请参加其他项目！");
                                break;
                            }
                            Worker worker4 = new Worker();
                            worker4.prepare((Preparation) exam);
                            exam.examStart();
                            exam.examEnd();
                            ++examTaken;
                            break;
                        //返回上一层菜单
                        case 0:
                            advancedMath.getLast().printMenu();
                            i = input.nextInt();
                            break;
                        default:
                            break;
                    }
                    if (examTaken == 4) {
                        System.out.println("");
                    }
                    break;
                }
                //进行教辅资料测采购，进行刷题来提升自己的水平
                case 2:
                    CCommandFn CCommandFn = (CCommandFn) rootMenu.getMenu().get(1).option;
                    boolean isBook = false;
                    try {
                        isBook = CCommandFn.CommandFn();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(isBook){
                        System.out.println("你买了这些教辅资料之后进行了孜孜不倦地刷题，状态获得了提升！");
                        switch (student.getStudentState().toString()) {
                            case "StatePerfect":
                                break;
                            case "StateGood":
                                student.setStudentState(new StatePerfect());
                                break;
                            case "StateTired":
                                student.setStudentState(new StateGood());
                                break;
                            default:
                                break;
                        }
                        CMediatorFn.getInstance().MediateFn();
                    }
                    break;
                case 3:
                    System.out.println("输入要询问的玩家编号：");
                    int n = input.nextInt() - 1;
                    System.out.println("选择要询问的考试 [1]高等数学 [2]大学英语 [3]大学政治 [4]计算机408");
                    int m = input.nextInt();
                    Exam exam = ExamContainer.getInstance().get(m - 1);
                    if (!exam.isTaken()) {
                        System.out.println("该考试尚未开始！");
                        break;
                    }
                    CVisitorFn.VisitorFn(n, exam);
                    break;
                case 4:
//                    System.out.println("欢迎光临运SCBoy外设专卖店！");
//                    System.out.println("选购心仪的装备 [1]大而优鼠标 [2]镭射键盘 [3]洛基耳机");
//                    int k = input.nextInt();
//                    if (k == 1) {
//                        MousePeripheralFactory mouseFactory = new MousePeripheralFactory();
//                        Peripheral mouse = mouseFactory.createPeripheral(player);
//                        PeripheralWearer ei = new PerfectPeripheral();
//                        PlayerPeripheral peripheral = new MouseWearing(ei);
//                        peripheral.PeripheralWear(player, mouse);
//                    } else if (k == 2) {
//                        KeyboardFactory keyboardFactory = new KeyboardFactory();
//                        Peripheral keyBoard = keyboardFactory.createPeripheral(player);
//                        PeripheralWearer ei = new PerfectPeripheral();
//                        PlayerPeripheral peripheral = new KeyboardWearing(ei);
//                        peripheral.PeripheralWear(player, keyBoard);
//                    } else if (k == 3) {
//                        EarphoneFactory earphoneFactory = new EarphoneFactory();
//                        Peripheral earphone = earphoneFactory.createPeripheral(player);
//                        PeripheralWearer ei = new PerfectPeripheral();
//                        PlayerPeripheral peripheral = new KeyboardWearing(ei);
//                        peripheral.PeripheralWear(player, earphone);
//                    }
                    break;
                case 5:
//                    ScoreSheet proxyScoreSheet = new ProxyScoreSheet();
//                    proxyScoreSheet.printScoreSheet();
                    break;
                case 6:
//                    try {
//                        PrototypeFunction.PrototypeFn();
//                    } catch (CloneNotSupportedException e) {
//                        e.printStackTrace();
//                    }
                case 0:
                    break;
                default:
                    break;
            }
            if (examTaken == 5) {
                System.out.println("所有比赛均已结束！");
                break;
            }

            rootMenu.printMenu();
            i = input.nextInt();
        }
        System.out.println("考研顶峰云系统已关闭！欢迎您的再一次使用！");
    }

    private static class SingletonHolder {
        // 静态初始化器，有JVM来保证线程安全
        private static BoiledCodfishCarnivalWithCheese instance = new BoiledCodfishCarnivalWithCheese();
    }

}
