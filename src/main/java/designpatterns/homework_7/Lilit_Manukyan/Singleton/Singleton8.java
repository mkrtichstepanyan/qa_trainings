package designpatterns.homework_7.Lilit_Manukyan.Singleton;

public class Singleton8 {
    private Singleton8() {

    }

    private static Singleton8 getInstance() {
        return LoadSingleton8.INSTANCE;
    }

    private static class LoadSingleton8 {
        static final Singleton8 INSTANCE = new Singleton8();
    }
}
