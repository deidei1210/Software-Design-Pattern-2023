package Singleton_LazyInitialization;

import Bridge.*;
import Builder.Game;
import Builder.GamesBuilder;
import Command.CCommandFn;
import Composite.Menu;
import Composite.MenuOption;
import Facade.Facade;
import FactoryMethod.EarphoneFactory;
import FactoryMethod.KeyboardFactory;
import FactoryMethod.MousePeripheralFactory;
import FactoryMethod.Peripheral;
import Mediator.CMediatorFn;
import Prototype.PrototypeFunction;
import Proxy.ProxyScoreSheet;
import Proxy.ScoreSheet;
import Servant.Preparation;
import Servant.Worker;
import State.StateGood;
import State.StatePerfect;
import Template_Strategy.*;
import Visitor.CVisitorFn;

import SimpleFactory_new.Student;
import SimpleFactory_new.StudentFactory;
import Iterator_new.ExamContainer;
import Iterator_new.StudentContainer;
import Builder_new.Exam;
import Builder_new.ExamsBuilder;

import Facade_new.ExamFacade;

import java.util.Scanner;

public class BoiledCodfishCarnivalWithCheese {

    //创建 Singleton.AnimalSportMeeting 的一个对象

    private Player player;

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
        System.out.println("欢迎来到芝士煲鳕嘉年华！");
        Scanner input = new Scanner(System.in);
        //创建玩家
        System.out.println("请输入你的名字：");
        String name = input.nextLine();
        System.out.println("选择你的俱乐部 [1]EDG [2]IG [3]RNG");
        int clubNum = input.nextInt();
        System.out.println("选择你的国籍 [1]China [2]America [3]Japan");
        int nationNum = input.nextInt();
        String club = "EDG";
        String nation = "China";
        switch (clubNum) {
            case 1:
                club = "EDG";
                break;
            case 2:
                club = "IG";
                break;
            case 3:
                club = "RNG";
                break;
            default:
                break;
        }
        switch (nationNum) {
            case 1:
                nation = "China";
                break;
            case 2:
                nation = "America";
                break;
            case 3:
                nation = "Japan";
                break;
            default:
                break;
        }
        PlayerFactory playerFactory = new PlayerFactory();
        player = playerFactory.createPlayer(club, nation);
        player.setPlayerName(name);
        PlayerContainer.getInstance().add(player);
        //创建NPC玩家
        PlayerContainer.getInstance().add(playerFactory.createPlayer("EDG", "China"));
        PlayerContainer.getInstance().add(playerFactory.createPlayer("EDG", "Japan"));
        PlayerContainer.getInstance().add(playerFactory.createPlayer("EDG", "America"));
        PlayerContainer.getInstance().add(playerFactory.createPlayer("IG", "China"));
        PlayerContainer.getInstance().add(playerFactory.createPlayer("IG", "Japan"));
        PlayerContainer.getInstance().add(playerFactory.createPlayer("RNG", "China"));
        PlayerContainer.getInstance().add(playerFactory.createPlayer("RNG", "America"));
        //创建比赛项目
        GamesBuilder.getInstance().buildGames();
        for (Game game : GameContainer.getInstance().getGames()) {
            game.showGameInfo();
        }
        //学生检入
        ExamFacade facade = new ExamFacade();
        facade.method();
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
