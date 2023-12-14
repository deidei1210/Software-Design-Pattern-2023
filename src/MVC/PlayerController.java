package MVC;

public class PlayerController {
    private Player model;
    private PlayerViews view;

    public PlayerController(Player model, PlayerViews views) {
        this.model = model;
        this.view = views;
    }

    public void setPlayerName(String name){
        model.setPlayerName(name);
    }

    public String getPlayerName(){
        return model.getPlayerName();
    }

    public void updateView(){
        view.printPlayerDetails(model.getPlayerName());
    }
}
