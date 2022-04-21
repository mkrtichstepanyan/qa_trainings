package designpatterns.homework_7.Lilit_Manukyan.Singleton;

public class Singleton7 {
    private static volatile Singleton7 instance;

    private Singleton7() {

    }

    public static Singleton7 getInstance() {
        Singleton7 result = instance;
        if (result == null) {
            synchronized (Singleton7.class) {
                if (result == null) {
                    instance = result = new Singleton7();
                }
            }
        }
        return instance;
    }
}
