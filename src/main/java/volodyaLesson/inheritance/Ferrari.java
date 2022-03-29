package volodyaLesson.inheritance;

public class Ferrari extends RacingCar{
    @Override
    public void takeOff() {
        System.out.println("Ferrari is taking off!!!");
    }

    @Override
    void pitStop() {
        System.out.println("Ferrari team pit stop: changing tires, refilling");
    }
}
