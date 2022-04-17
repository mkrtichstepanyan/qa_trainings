package designpatterns.singleton;

public class Singleton6 {

    private Singleton6() {
    }

    public static Singleton6 getInstance() {
        return LoadSingleton.INSTANCE;
    }

    private static class LoadSingleton {
        static final Singleton6 INSTANCE = new Singleton6();
    }
}
