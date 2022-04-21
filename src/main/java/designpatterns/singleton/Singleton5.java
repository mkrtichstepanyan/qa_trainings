package designpatterns.singleton;

public class Singleton5 {

    private final String data;
    private static volatile Singleton5 instance;

    private Singleton5(String data) {
        this.data = data;
    }

    // TODO: every time to access to instance thread need to take it from main memory not from thread cache
    public static Singleton5 getInstance(String data) {
        Singleton5 result = instance;

        if (result == null) {

            synchronized (Singleton5.class) {
                if (result == null) {
                    instance = result = new Singleton5(data);
                }
            }
        }
        return result;
    }

    public String getData() {
        return data;
    }
}
