package designpatterns.homework_7.Heghine_Khachatryan.state;

public class OFFState implements State {
    @Override
    public void pressButton(StateDescriber state) {
        System.out.println("Phone is turned on. Please press button to turn off.");
        state.setState(new ONState());
    }

    @Override
    public void describeState() {
        System.out.println("Phone is turned on after pressing the button.");
    }
}
