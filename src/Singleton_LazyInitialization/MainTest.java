package Singleton_LazyInitialization;

import AbstractFactory.Judge;
import AbstractFactory.JudgeStore;
import Adapter.AliAdapter;
import Bridge.PlayerPeripheral;
import Bridge.PeripheralWearer;
import Bridge.PerfectPeripheral;
import Bridge.MouseWearing;
import Builder.Game;
import Builder.GamesBuilder;
import Command.AddChiliCommand;
import Command.AddOilCommand;
import Command.CCommandFn;
import Command.Command;
import Command.OrderPancakeCommand;
import Memento.*;
import Composite.Menu;
import Composite.MenuOption;
import DAO.PlayerDao;
import DAO.PlayerDaoImpl;
import Decorator.Food;
import Facade.Facade;
import FactoryMethod.Peripheral;
import FactoryMethod.MousePeripheralFactory;
import Filter.Criteria;
import Filter.EDGCriteria;
import FrontController.Controller;
import InterceptingFilter.AuthenticationFilter;
import InterceptingFilter.FilterManager;
import InterceptingFilter.HealthIdentification;
import InterceptingFilter.LoggerFilter;
import Interpreter.ExchangePrice;
import Interpreter.OriginalPrice;
import Interpreter.Price;
import Iterator.PlayerContainer;
import Iterator.GameContainer;
import MVC.PlayerController;
import MVC.PlayerViews;
import Mediator.ConcretePlayer;
import Mediator.ConcreteMediator;
import Mediator.ConcreteOthers;
import NullObject.AbstractCustomer;
import NullObject.CustomerFactory;
import Observer.ScoreSubject;
import Flyweight.AttributeFactory;
import Prototype.EDGFans;
import Proxy.ProxyScoreSheet;
import Proxy.ScoreSheet;
import Servant.Preparation;
import SimpleFactory.Player;
import SimpleFactory.PlayerFactory;
import TransferObject.PlayerBO;
import Visitor.CVisitorFn;

import java.util.ArrayList;

import static Flyweight.FansFlyweight.getRandomAge;
import static Flyweight.FansFlyweight.getRandomSex;

public class MainTest {
    //单例模式
    private static MainTest instance = new MainTest();
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
        FrontControllerTest();
        InterceptingFilterTest();
    }

    //1 单例模式（Singleton Pattern）
    public void SingletonTest() {
        System.out.println("1 单例模式（Singleton Pattern）");
        System.out.println("包:Singleton_LazyInitialization");
        System.out.println("类：BoiledCodfishMeeting");
        System.out.println("实现接口：BoiledCodfishMeeting.getInstance()");
        System.out.println("测试信息：");
        BoiledCodfishCarnivalWithCheese.getInstance().showMessage();
        System.out.println();
    }

    //2 简单工厂模式（Simple Factory Pattern）
    public void SimpleFactoryTest() {
        System.out.println("2 简单工厂模式（Simple Factory Pattern）");
        System.out.println("包:SimpleFactory");
        System.out.println("类：PlayerFactory");
        System.out.println("实现接口：PlayerFactory.createPlayer(String club, String nationality)");
        System.out.println("测试信息：");
        Player player = new PlayerFactory().createPlayer("EDG", "China");
        if (player != null) {
            System.out.println("玩家创建成功！");
            player.showPlayerInfo();
        } else {
            System.out.println("玩家创建失败！");
        }
        PlayerContainer.getInstance().add(player);
        System.out.println();
    }

    //3 迭代器模式（Iterator Pattern）
    public void IteratorTest() {
        System.out.println("3 迭代器模式（Iterator Pattern）");
        System.out.println("包:Iterator");
        System.out.println("类：PlayerContainer");
        System.out.println("实现接口：PlayerContainer.getInstance()");
        System.out.println("测试信息：");
        PlayerFactory playerFactory = new PlayerFactory();
        PlayerContainer.getInstance().add(playerFactory.createPlayer("EDG", "China"));
        PlayerContainer.getInstance().add(playerFactory.createPlayer("EDG", "Japan"));
        PlayerContainer.getInstance().add(playerFactory.createPlayer("EDG", "America"));
        PlayerContainer.getInstance().add(playerFactory.createPlayer("IG", "China"));
        PlayerContainer.getInstance().add(playerFactory.createPlayer("IG", "Japan"));
        PlayerContainer.getInstance().add(playerFactory.createPlayer("RNG", "China"));
        PlayerContainer.getInstance().add(playerFactory.createPlayer("RNG", "America"));
        ArrayList<Player> players = PlayerContainer.getInstance().getplayers();
        if (!players.isEmpty()) {
            System.out.println("玩家列表获取成功！");
            for (Player athlete : players) {
                athlete.showPlayerInfo();
            }
        } else {
            System.out.println("玩家列表获取失败！");
        }
        System.out.println();
    }

    //4 抽象工厂模式（Abstract Factory Pattern）
    public void AbstractFactoryTest() {
        System.out.println("4 抽象工厂模式（Abstract Factory Pattern）");
        System.out.println("包:AbstractFactory");
        System.out.println("类：JudgeStore");
        System.out.println("实现接口：judge = JudgeStore.getInstance().orderJudge(String JudgeName)");
        System.out.println("测试信息：");
        Judge judge = JudgeStore.getInstance().orderJudge("SCSC");
        judge.setJudgeName("星际老男孩");
        System.out.println("裁判创建成功！");
        System.out.println("裁判姓名：" + judge.getJudgeName());
        System.out.println("比赛项目：" + judge.getGameType().toString());
        System.out.println();
    }

    //5 建造者模式（Builder Pattern）
    public void BuilderTest() {
        System.out.println("5 建造者模式（Builder Pattern）");
        System.out.println("包:Builder");
        System.out.println("类：GamesBuilder");
        System.out.println("实现接口：GamesBuilder.getInstance().buildGames()");
        System.out.println("测试信息：");
        GamesBuilder.getInstance().buildGames();
        if (!GameContainer.getInstance().getGames().isEmpty()) {
            System.out.println("比赛创建成功！");
            for (Game game : GameContainer.getInstance().getGames()) {
                game.showGameInfo();
            }
        } else {
            System.out.println("比赛创建失败！");
        }
        System.out.println();
    }

    //6 外观模式（Facade Pattern）
    public void FacadeTest() {
        System.out.println("6 外观模式（Facade Pattern）");
        System.out.println("包:Facade");
        System.out.println("类：Facade");
        System.out.println("实现接口：facade.method()");
        System.out.println("测试信息：");
        Facade facade = new Facade();
        facade.method();
        System.out.println("玩家检录完成！");
        System.out.println();
    }

    //7 组合模式（Composite Pattern）
    public void CompositeTest() {
        System.out.println("7 组合模式（Composite Pattern）");
        System.out.println("包:Composite");
        System.out.println("类：MenuOption");
        System.out.println("实现接口：printMenu()");
        System.out.println("测试信息：");
        //设置测试用菜单
        Menu rootMenu = new Menu("大厅选择");
        //第一个比赛菜单
        Menu gameMenu = new Menu("比赛");
        //创建三个比赛实例
        int element = 0;
        MenuOption forwardWatch = new MenuOption("守望前锋：再也不来", GameContainer.getInstance().get(0));
        MenuOption heroOfFan = new MenuOption("风扇英雄", GameContainer.getInstance().get(1));
        MenuOption mgaicWarCraft = new MenuOption("魔怪争霸2", GameContainer.getInstance().get(2));
        MenuOption seaCraft = new MenuOption("星河争霸3", GameContainer.getInstance().get(3));
        MenuOption loreOfLU = new MenuOption("卢氏传说", GameContainer.getInstance().get(4));
        MenuOption contest = new MenuOption("对抗赛", GameContainer.getInstance().get(5));
        // 向比赛菜单中添加五个选项
        // 可在此处创建五个比赛实例替换 Add 中参数 element  后续同理
        gameMenu.add(forwardWatch);
        gameMenu.add(heroOfFan);
        gameMenu.add(mgaicWarCraft);
        gameMenu.add(seaCraft);
        gameMenu.add(loreOfLU);
        gameMenu.add(contest);
        MenuOption canteen = new MenuOption("嘉年华食堂(芜湖赞助)", CCommandFn.getInstance());
        MenuOption queryRank = new MenuOption("询问成绩", element);
        MenuOption buyEquipment = new MenuOption("买外设", element);
        MenuOption printRank = new MenuOption("打印成绩单", element);
        MenuOption meetAudience = new MenuOption("粉丝见面会", element);
        rootMenu.add(gameMenu);
        rootMenu.add(canteen);
        rootMenu.add(queryRank);
        rootMenu.add(buyEquipment);
        rootMenu.add(printRank);
        rootMenu.add(meetAudience);
        // 菜单以及选择返回
        System.out.println("打印一级菜单：");
        rootMenu.printMenu();
        System.out.println("打印二级菜单：");
        gameMenu.printMenu();
        System.out.println();
    }

    //8 模板模式（Template Pattern）
    public void TemplateTest() {
        System.out.println("8 模板模式（Template Pattern）");
        System.out.println("包:Template_Strategy");
        System.out.println("类：ForwardWatch/HeroOfFan/LoreOfLU/MagicWarCraft/SeaCraft/Contest");
        System.out.println("实现接口：game.showGameInfo()");
        System.out.println("测试信息：");
        for (Game game : GameContainer.getInstance().getGames()) {
            game.showGameInfo();
        }
        System.out.println();
    }

    //9 策略模式（Strategy Pattern）
    public void StrategyTest() {
        System.out.println("9 策略模式（Strategy Pattern）");
        System.out.println("包:Template_Strategy");
        System.out.println("类：ForwardWatch/HeroOfFan/LoreOfLU/MagicWarCraft/SeaCraft");
        System.out.println("实现接口：game.gameStart()");
        System.out.println("测试信息：");
        for (int i = 0; i < 5; ++i) {
            GameContainer.getInstance().get(i).gameStart();
            GameContainer.getInstance().get(i).gameEnd();
        }
        System.out.println();
    }

    //10 状态模式（State Pattern）
    public void StateTest() {
        System.out.println("10 状态模式（State Pattern）");
        System.out.println("包:State");
        System.out.println("类：PlayerState");
        System.out.println("实现接口：player.getPlayerState()");
        System.out.println("测试信息：");
        System.out.println("当前状态：" + PlayerContainer.getInstance().get(0).getPlayerState().toString());
        System.out.println();
    }

    //11 观察者模式（Observer Pattern）
    public void ObserverTest() {
        System.out.println("11 观察者模式（Observer Pattern）");
        System.out.println("包:Observer");
        System.out.println("类：PlayerObserver");
        System.out.println("实现接口：ScoreSubject.getInstance().notifyObserver(int game, int[] rank, double[] score)");
        System.out.println("测试信息：");
        Player player = PlayerContainer.getInstance().get(0);
        System.out.println("原始数据：");
        System.out.println(player.getPlayerName() + " 项目："
                + GameContainer.getInstance().get(0).getName() + " 成绩（秒）："
                + player.getScore()[0] + " 名次：" + player.getRank()[0]);
        ScoreSubject.getInstance().notifyObserver(0, new int[]{1}, new double[]{9.58});
        System.out.println("数据同步更新成功！");
        System.out.println(player.getPlayerName() + " 项目："
                + GameContainer.getInstance().get(0).getName() + " 成绩（秒）："
                + player.getScore()[0] + " 名次：" + player.getRank()[0]);
        System.out.println();
    }

    //12 命令模式（Command Pattern）
    public void CommandTest() throws InterruptedException {
        System.out.println("12 命令模式（Command Pattern）");
        System.out.println("包:Command_Memento");
        System.out.println("类：Command");
        System.out.println("实现接口：Command.execute()");
        System.out.println("测试信息：");
        CareTaker orderList = new CareTaker();
        Command orderPancake = new OrderPancakeCommand();
        orderPancake.execute();
        Food myPancake = orderPancake.getMyFood();
        orderList.append(orderPancake, myPancake.createMemento());
        System.out.println("你的点单: " + myPancake.getDescription());
        System.out.println();
    }

    //13 装饰器模式（Decorator Pattern）
    public void DecoratorTest() throws InterruptedException {
        System.out.println("13 装饰器模式（Decorator Pattern）");
        System.out.println("包:Decorator");
        System.out.println("类：CondimentDecorator");
        System.out.println("实现接口：CondimentDecorator.getMyFood()");
        System.out.println("测试信息：");
        CareTaker orderList = new CareTaker();
        Command orderPancake = new OrderPancakeCommand();
        orderPancake.execute();
        Food myPancake = orderPancake.getMyFood();
        orderList.append(orderPancake, myPancake.createMemento());
        Command addOil = new AddOilCommand(myPancake);
        addOil.execute();
        orderList.append(addOil, myPancake.createMemento());
        Command addChili = new AddChiliCommand(myPancake);
        addChili.execute();
        orderList.append(addChili, myPancake.createMemento());
        System.out.println("你的点单: " + myPancake.getDescription());
        System.out.println();
    }

    //14 备忘录模式（Memento Pattern）
    public void MementoTest() throws InterruptedException {
        System.out.println("14 备忘录模式（Memento Pattern）");
        System.out.println("包:Command_Memento");
        System.out.println("类：CareTaker");
        System.out.println("实现接口：CareTaker.undo()/CareTaker.redo()");
        System.out.println("测试信息：");
        CareTaker orderList = new CareTaker();
        Command orderPancake = new OrderPancakeCommand();
        orderPancake.execute();
        Food myPancake = orderPancake.getMyFood();
        orderList.append(orderPancake, myPancake.createMemento());
        Command addOil = new AddOilCommand(myPancake);
        addOil.execute();
        orderList.append(addOil, myPancake.createMemento());
        System.out.println("你目前的点单为:" + myPancake.getDescription());
        System.out.println("Order:撤销");
        orderList.undo();
        System.out.println("你目前的点单为:" + myPancake.getDescription());
        System.out.println("Order:重做");
        orderList.redo();
        System.out.println("你目前的点单为:" + myPancake.getDescription());
        Command addChili = new AddChiliCommand(myPancake);
        addChili.execute();
        orderList.append(addChili, myPancake.createMemento());
        System.out.println("你最终点单为: " + myPancake.getDescription());
        System.out.println();
    }

    //15 工厂方法模式（Factory Method Pattern）
    public void FactoryMethodTest() {
        System.out.println("15 工厂方法模式（Factory Method Pattern）");
        System.out.println("包:FactoryMethod");
        System.out.println("类：MousePeripheralFactory");
        System.out.println("实现接口：MousePeripheralFactory.createPeripheral(Player owner)");
        System.out.println("测试信息：");
        Player player = PlayerContainer.getInstance().get(0);
        MousePeripheralFactory mouseFactory = new MousePeripheralFactory();
        Peripheral mouse = mouseFactory.createPeripheral(player);
        System.out.println("外设创建成功！");
        System.out.println("外设类型：" + mouse.getPeripheralName());
        System.out.println();
    }

    //16 桥接模式（Bridge Pattern）
    public void BridgeTest() {
        System.out.println("16 桥接模式（Bridge Pattern）");
        System.out.println("包:Bridge");
        System.out.println("类：PeripheralWearer");
        System.out.println("实现接口：PerfectPeripheral.PeripheralWear(Player player, Peripheral peripheral)");
        System.out.println("测试信息：");
        Player player = PlayerContainer.getInstance().get(0);
        MousePeripheralFactory mouseFactory = new MousePeripheralFactory();
        Peripheral mouse = mouseFactory.createPeripheral(player);
        PeripheralWearer ei = new PerfectPeripheral();
        PlayerPeripheral peripheral = new MouseWearing(ei);
        peripheral.PeripheralWear(player, mouse);
        System.out.println("装备前手速：" + player.getHandspeed());
        System.out.println("装备后手速：" + player.getHandspeed());
        System.out.println();
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
        Others.send("在食堂偶遇其他选手，通知了你尽快参加比赛。");
        System.out.println();
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
    }

    //19 享元模式（Flyweight Pattern）
    public void FlyweightTest() {
        System.out.println("19 享元模式（Flyweight Pattern）");
        System.out.println("包:Prototpye_Flyweight");
        System.out.println("类：AttributeFactory");
        System.out.println("实现接口：AttributeFactory.setEDGAudience()");
        System.out.println("测试信息：");
        System.out.println("观众创建成功！");
        EDGFans EDGFan = (EDGFans) AttributeFactory.setEDGFans("China");
        EDGFan.setAge(getRandomAge());
        EDGFan.setSex(getRandomSex());
        EDGFan.printClub();
        System.out.println();
    }

    //20 原型模式（Prototype Pattern）
    public void PrototypeTest() {
        System.out.println("20 原型模式（Prototype Pattern）");
        System.out.println("包:Prototpye_Flyweight");
        System.out.println("类：AudienceCache");
        System.out.println("实现接口：AudienceCache.getAudience(String audienceId)");
        System.out.println("测试信息：");
        EDGFans EDGFans1 = (EDGFans) AttributeFactory.setEDGFans("China");
        EDGFans1.setAge(getRandomAge());
        EDGFans1.setSex(getRandomSex());
        EDGFans1.printClub();
        System.out.println("Clone Successfully!");
        EDGFans EDGFans2 = (EDGFans) AttributeFactory.setEDGFans("China");
        EDGFans2.setAge(getRandomAge());
        EDGFans2.setSex(getRandomSex());
        EDGFans2.printClub();
        System.out.println();
    }

    //21 访问者模式（Visitor Pattern）
    public void VisitorTest() {
        System.out.println("21 访问者模式（Visitor Pattern）");
        System.out.println("包:Visitor");
        System.out.println("类：Visitor");
        System.out.println("实现接口：Visitor.getAudience(String audienceId)");
        System.out.println("测试信息：");
        CVisitorFn.VisitorFn(0, GameContainer.getInstance().get(0));
        System.out.println();
    }

    //22 责任链模式（Chain Of Responsibility Pattern）
    public void ChainOfResponsibilityTest() {
        System.out.println("22 责任链模式（Chain Of Responsibility Pattern）");
        System.out.println("包:ChainOfResponsibility");
        System.out.println("类：PlayerFighters");
        System.out.println("实现接口：PlayerFighters.fight()");
        System.out.println("测试信息：");
        GameContainer.getInstance().get(5).gameStart();
        GameContainer.getInstance().get(5).gameEnd();
        System.out.println();
    }

    //23 延迟初始化模式（Lazy Initialization Pattern）
    public void LazyInitializationTest() {
        System.out.println("23 延迟初始化模式（Lazy Initialization Pattern）");
        System.out.println("包:Singleton_LazyInitialization");
        System.out.println("类：BoiledCodfishCarnivalWithCheese");
        System.out.println("实现接口：BoiledCodfishCarnivalWithCheese()");
        System.out.println("测试信息：");
        System.out.println("静态初始化器，通过JVM来保证线程安全");
        BoiledCodfishCarnivalWithCheese.getInstance().showMessage();
        System.out.println();
    }

    //24 MVC模式（MVC Pattern）
    public void MVCTest() {
        System.out.println("24 MVC模式（MVC Pattern）");
        System.out.println("包:MVC");
        System.out.println("类：PlayerController");
        System.out.println("实现接口：PlayerController.updateView()");
        System.out.println("测试信息：");
        Player player = new PlayerFactory().createPlayer("EDG", "China");
        PlayerViews views = new PlayerViews();
        PlayerController controller = new PlayerController(player, views);
        controller.updateView();
        System.out.println("修改姓名为：JieJie");
        controller.setPlayerName("JieJie");
        controller.updateView();
        System.out.println();
    }

    //25 传输对象模式（Transfer Object Pattern）
    public void TransferObjectTest() {
        System.out.println("25 传输对象模式（Transfer Object Pattern）");
        System.out.println("包:TransferObject");
        System.out.println("类：PlayerBO");
        System.out.println("实现接口：PlayerBO.getPlayer(int rollNo)");
        System.out.println("测试信息：");
        PlayerBO playerBusinessObject = new PlayerBO();
        System.out.println("当前参赛成员列表：");
        for (Player players : playerBusinessObject.getAllPlayers()) {
            System.out.println("名字: " + players.getPlayerName());
        }
        playerBusinessObject.deletePlayer(playerBusinessObject.getPlayer(2));
        System.out.println("当前参赛成员列表：");
        for (Player players : playerBusinessObject.getAllPlayers()) {
            System.out.println("名字: " + players.getPlayerName());
        }
        Player player = new PlayerFactory().createPlayer("RNG", "Japan");
        playerBusinessObject.updatePlayer(player);
        System.out.println("当前参赛成员列表：");
        for (Player animals : playerBusinessObject.getAllPlayers()) {
            System.out.println("名字: " + animals.getPlayerName());
        }
        System.out.println();
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
    }

    //27 雇工模式（Servant Pattern）
    public void ServantTest() {
        System.out.println("27 雇工模式（Servant Pattern）");
        System.out.println("包:Servant");
        System.out.println("类：Worker");
        System.out.println("实现接口：Worker.prepare(Preparation game)");
        System.out.println("测试信息：");
        Preparation game = (Preparation) GameContainer.getInstance().get(0);
        game.gamePreparation();
        System.out.println();
    }

    //28 DAO模式（DAO Pattern）
    public void DaoTest() {
        System.out.println("28 DAO模式（DAO Pattern）");
        System.out.println("包:DAO");
        System.out.println("类：PlayerDaoImpl");
        System.out.println("实现接口：PlayerDaoImpl.getAllPlayers()");
        System.out.println("测试信息：");
        PlayerDao playerDao = new PlayerDaoImpl();
        //输出所有的运动员
        for (DAO.Player player : playerDao.getAllPlayers()) {
            System.out.println("编号 : "
                    + player.getRollNo() + ", 姓名 : " + player.getName());
        }
        //更新运动员
        DAO.Player player = playerDao.getAllPlayers().get(0);
        player.setName("ShowMaker");
        playerDao.updatePlayer(player);
        //获取运动员
        playerDao.getPlayer(0);
        System.out.println("编号 : "
                + player.getRollNo() + ", 姓名 : " + player.getName());
        System.out.println();
    }

    //29 过滤器模式（Filter Pattern）
    public void FilterTest() {
        System.out.println("29 过滤器模式（Filter Pattern）");
        System.out.println("包:Filter");
        System.out.println("类：Criteria");
        System.out.println("实现接口：EDGCriteria.meetCriteria(ArrayList<Player> playerList)");
        System.out.println("测试信息：");
        ArrayList<Player> playerList;
        playerList = PlayerContainer.getInstance().getplayers();
        Criteria edgCriteria = new EDGCriteria();
        System.out.println("Before Filtering:");
        for (Player player : playerList) {
            System.out.println(player.getPlayerClub().getClub() + player.getPlayerNationality().getNationality() + ":" + player.getPlayerName());
        }
        ArrayList<Player> filterList = edgCriteria.meetCriteria(playerList);
        System.out.println("After Filtering(EDG):");
        for (Player player : filterList) {
            System.out.println(player.getPlayerClub().getClub() + player.getPlayerNationality().getNationality() + ":" + player.getPlayerName());
        }
        System.out.println();
    }

    //30 适配器模式（Adapter Pattern）
    public void AdapterTest() {
        System.out.println("30 适配器模式（Adapter Pattern）");
        System.out.println("包:AliAdapter");
        System.out.println("类：Criteria");
        System.out.println("实现接口：AliAdapter().pay()");
        System.out.println("测试信息：");
        new AliAdapter().pay();
        System.out.println();
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
    }

    //32 前端控制器模式（Front Controller Pattern）
    public void FrontControllerTest() {
        System.out.println("32 前端控制器模式（Front Controller Pattern）");
        System.out.println("包:FrontController");
        System.out.println("类：Controller");
        System.out.println("实现接口：Controller.dispatchRequest(String)");
        System.out.println("测试信息：");
        Controller frontController = new Controller();
        frontController.dispatchRequest("JUDGE");
        frontController.dispatchRequest("PLAYER");
        System.out.println();
    }

    //33 拦截过滤器模式（Intercepting Filter Pattern）
    public void InterceptingFilterTest() {
        System.out.println("33 拦截过滤器模式（Intercepting Filter Pattern）");
        System.out.println("包:InterceptingFilter");
        System.out.println("类：Controller");
        System.out.println("实现接口：FilterManager.filterRequest(String)");
        System.out.println("测试信息：");
        FilterManager filterManager = new FilterManager(new HealthIdentification());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new LoggerFilter());
        filterManager.filterRequest("Athlete:EDG Japan");
        System.out.println();
    }

}
