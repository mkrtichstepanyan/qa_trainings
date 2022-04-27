package designpatterns.homework_7.Heghine_Khachatryan.state;

public class Main {
    public static void main(String[] args) {
        StateDescriber state = new StateDescriber();

        state.turnOnState();
        state.describeCurrentState();

        state.turnOFFState();
        state.describeCurrentState();
    }
}
