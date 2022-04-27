package designpatterns.homework_7.Heghine_Khachatryan.state;

public class StateDescriber {
    State state = new OFFState();

    public void turnOnState() {
        state.pressButton(this);
    }

    public void turnOFFState() {
        state.pressButton(this);
    }

    public void describeCurrentState() {
        state.describeState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
