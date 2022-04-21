package designpatterns.homework_7.Lilit_Manukyan.Singleton;

public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4() {

    }

    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}
