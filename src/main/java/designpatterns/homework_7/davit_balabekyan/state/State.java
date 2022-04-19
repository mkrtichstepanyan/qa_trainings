package designpatterns.homework_7.davit_balabekyan.state;

public abstract class State {

    protected Phone phone;

    public State(Phone phone){
        this.phone = phone;
    }

    public abstract String onHome();

    public abstract String onOffOn();
}
