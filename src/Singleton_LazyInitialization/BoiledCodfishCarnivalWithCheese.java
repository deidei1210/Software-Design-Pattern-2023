package Singleton_LazyInitialization;

import Builder_new.Exam;
import Builder_new.ExamsBuilder;

import SimpleFactory_new.Student;
import SimpleFactory_new.StudentFactory;
import Iterator_new.ExamContainer;
import Iterator_new.StudentContainer;

import java.util.Scanner;

public class BoiledCodfishCarnivalWithCheese {

    //创建 Singleton.AnimalSportMeeting 的一个对象

    private Student student;

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
        student = StudentFactory.createStudent(major, educationLevel);
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
//        //玩家检入
//        Facade facade = new Facade();
//        facade.method();
//        //比赛正式开始
//        //设置测试用菜单
//        Menu rootMenu = new Menu("大厅选择");
//        //第一个比赛菜单
//        Menu gameMenu = new Menu("比赛");
//        //创建比赛实例
//        int element = 0;
//        MenuOption forwardWatch = new MenuOption("守望前锋：再也不来", GameContainer.getInstance().get(0));
//        MenuOption heroOfFan = new MenuOption("风扇英雄", GameContainer.getInstance().get(1));
//        MenuOption mgaicWarCraft = new MenuOption("魔怪争霸2", GameContainer.getInstance().get(2));
//        MenuOption seaCraft = new MenuOption("星河争霸3", GameContainer.getInstance().get(3));
//        MenuOption loreOfLU = new MenuOption("卢氏传说", GameContainer.getInstance().get(4));
//        MenuOption contest = new MenuOption("对抗赛", GameContainer.getInstance().get(5));
//        // 向比赛菜单中添加6个选项
//        // 可在此处创建6个比赛实例替换 Add 中参数 element  后续同理
//        gameMenu.add(forwardWatch);
//        gameMenu.add(heroOfFan);
//        gameMenu.add(mgaicWarCraft);
//        gameMenu.add(seaCraft);
//        gameMenu.add(loreOfLU);
//        gameMenu.add(contest);
//        MenuOption canteen = new MenuOption("嘉年华食堂(芜湖赞助)", CCommandFn.getInstance());
//        MenuOption queryRank = new MenuOption("询问成绩", element);
//        MenuOption buyEquipment = new MenuOption("买外设", element);
//        MenuOption printRank = new MenuOption("打印成绩单", element);
//        MenuOption meetAudience = new MenuOption("粉丝见面会", element);
//        rootMenu.add(gameMenu);
//        rootMenu.add(canteen);
//        rootMenu.add(queryRank);
//        rootMenu.add(buyEquipment);
//        rootMenu.add(printRank);
//        rootMenu.add(meetAudience);
//        // 菜单以及选择返回
//        rootMenu.printMenu();
//        int i = input.nextInt();
//        int gameVisited = 0;
//        while (i != 0) {
//            switch (i) {
//                case 1: {
//                    gameMenu.printMenu();
//                    Game game;
//                    switch (input.nextInt()) {
//                        case 1:
//                            game = (ForwardWatch) (gameMenu.getMenu().get(0).option);
//                            if (game.isVisited()) {
//                                System.out.println("该项目已结束，请参加其他项目！");
//                                break;
//                            }
//                            Worker worker1 = new Worker();
//                            worker1.prepare((Preparation) game);
//                            game.gameStart();
//                            game.gameEnd();
//                            ++gameVisited;
//                            break;
//                        case 2:
//                            game = (HeroOfFan) (gameMenu.getMenu().get(1).option);
//                            if (game.isVisited()) {
//                                System.out.println("该项目已结束，请参加其他项目！");
//                                break;
//                            }
//                            Worker worker2 = new Worker();
//                            worker2.prepare((Preparation) game);
//                            game.gameStart();
//                            game.gameEnd();
//                            ++gameVisited;
//                            break;
//                        case 3:
//                            game = (MagicWarCraft) (gameMenu.getMenu().get(2).option);
//                            if (game.isVisited()) {
//                                System.out.println("该项目已结束，请参加其他项目！");
//                                break;
//                            }
//                            Worker worker3 = new Worker();
//                            worker3.prepare((Preparation) game);
//                            game.gameStart();
//                            game.gameEnd();
//                            ++gameVisited;
//                            break;
//                        case 4:
//                            game = (SeaCraft) (gameMenu.getMenu().get(3).option);
//                            if (game.isVisited()) {
//                                System.out.println("该项目已结束，请参加其他项目！");
//                                break;
//                            }
//                            Worker worker4 = new Worker();
//                            worker4.prepare((Preparation) game);
//                            game.gameStart();
//                            game.gameEnd();
//                            ++gameVisited;
//                            break;
//                        case 5:
//                            game = (LoreOfLU) (gameMenu.getMenu().get(4).option);
//                            if (game.isVisited()) {
//                                System.out.println("该项目已结束，请参加其他项目！");
//                                break;
//                            }
//                            Worker worker5 = new Worker();
//                            worker5.prepare((Preparation) game);
//                            game.gameStart();
//                            game.gameEnd();
//                            ++gameVisited;
//                            break;
//                        case 6:
//                            game = (Contest) (gameMenu.getMenu().get(5).option);
//                            if (game.isVisited()) {
//                                System.out.println("该项目已结束，请参加其他项目！");
//                                break;
//                            }
//                            game.gameStart();
//                            game.gameEnd();
//                            ++gameVisited;
//                            break;
//                        case 0:
//                            forwardWatch.getLast().printMenu();
//                            i = input.nextInt();
//                            break;
//                        default:
//                            break;
//                    }
//                    if (gameVisited == 5) {
//                        System.out.println("");
//                    }
//                    break;
//                }
//                case 2:
//                    CCommandFn CCommandFn = (CCommandFn) rootMenu.getMenu().get(1).option;
//                    boolean isFood = false;
//                    try {
//                        isFood = CCommandFn.CommandFn();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    if(isFood){
//                        System.out.println("马厨师(做的饭)很下饭，状态提升！");
//                        switch (player.getPlayerState().toString()) {
//                            case "StatePerfect":
//                                break;
//                            case "StateGood":
//                                player.setPlayerState(new StatePerfect());
//                                break;
//                            case "StateTired":
//                                player.setPlayerState(new StateGood());
//                                break;
//                            default:
//                                break;
//                        }
//                        CMediatorFn.getInstance().MediateFn();
//                    }
//                    break;
//                case 3:
//                    System.out.println("输入要询问的玩家编号：");
//                    int n = input.nextInt() - 1;
//                    System.out.println("选择要询问的比赛 [1]守望前锋：再也不来 [2]风扇英雄 [3]魔怪争霸2 [4]星河争霸3 [5]卢氏传说");
//                    int m = input.nextInt();
//                    Game game = GameContainer.getInstance().get(m - 1);
//                    if (!game.isVisited()) {
//                        System.out.println("该比赛尚未开始！");
//                        break;
//                    }
//                    CVisitorFn.VisitorFn(n, game);
//                    break;
//                case 4:
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
//                    break;
//                case 5:
//                    ScoreSheet proxyScoreSheet = new ProxyScoreSheet();
//                    proxyScoreSheet.printScoreSheet();
//                    break;
//                case 6:
//                    try {
//                        PrototypeFunction.PrototypeFn();
//                    } catch (CloneNotSupportedException e) {
//                        e.printStackTrace();
//                    }
//                case 0:
//                    break;
//                default:
//                    break;
//            }
//            /*if (gameVisited == 5) {
//                System.out.println("所有比赛均已结束！");
//                break;
//            }*/
//            rootMenu.printMenu();
//            i = input.nextInt();
//        }
//        System.out.println("芝士煲鳕嘉年华到此结束！");
    }

    private static class SingletonHolder {
        // 静态初始化器，有JVM来保证线程安全
        private static BoiledCodfishCarnivalWithCheese instance = new BoiledCodfishCarnivalWithCheese();
    }

}
