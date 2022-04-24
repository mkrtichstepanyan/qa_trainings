package designpatterns.homework_7.Heghine_Khachatryan.state;

public class ONState implements State {
    @Override
    public void pressButton(StateDescriber state) {
        System.out.println("Phone is turned off. Please press button to turn on.");
        state.setState(new OFFState());
    }

    @Override
    public void describeState() {
        System.out.println("Phone is turned off after pressing the button.");
    }
}
