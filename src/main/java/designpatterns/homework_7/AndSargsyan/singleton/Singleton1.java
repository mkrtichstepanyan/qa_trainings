package designpatterns.homework_7.AndSargsyan.singleton;

public class Singleton1 {

    public static class SingletonHolder {
        public static final Singleton1 HOLDER_INSTANCE = new Singleton1();
    }

    public static Singleton1 getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
