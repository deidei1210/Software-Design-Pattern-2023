package MVC;

import SimpleFactory.Player;
import SimpleFactory.PlayerFactory;

import java.util.Scanner;

public class MVCPattern {
    public static void main(String[] args) {
        Player model = getPlayer();

        PlayerViews views = new PlayerViews();

        PlayerController controller = new PlayerController(model,views);

        controller.updateView();

        String str;
        System.out.println("请输入一个新名字:");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        controller.setPlayerName(str);

        controller.updateView();
    }

    private static Player getPlayer(){
        return new PlayerFactory().createPlayer("IG", "Japan");
    }
}
