package designpatterns.homework_7.Lilit_Manukyan.Singleton;

public class Singleton1 {
    private static Singleton1 innstance;

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        if (innstance == null) {
            innstance = new Singleton1();
        }
        return innstance;
    }
}
