package State;

public class StateContext {
    private PlayerState playerState;

    public void setPlayerState(PlayerState playerState) {
        this.playerState = playerState;

        this.playerState.setContext(this);
    }

    public double getState() {
        return this.playerState.getState();
    }

}
