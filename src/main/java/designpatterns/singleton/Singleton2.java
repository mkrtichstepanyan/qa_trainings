package designpatterns.singleton;

public class Singleton2 {

    private final String data;
    private static Singleton2 instance;

    private Singleton2(String data) {
        this.data = data;
    }

    // TODO: Thread safe but time consuming
    public static Singleton2 getInstance(String data) {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2(data);
                }
            }
        }

        return instance;
    }

    public String getData() {
        return data;
    }
}
