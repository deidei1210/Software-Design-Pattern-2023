package FrontController;

public class Dispatcher {
    private JudgeView judgeView;
    private PlayerView playerView;

    public Dispatcher() {
        judgeView = new JudgeView();
        playerView = new PlayerView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("JUDGE")) {
            judgeView.show();
        } else {
            playerView.show();
        }
    }
}
