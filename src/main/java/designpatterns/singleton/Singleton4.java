package designpatterns.singleton;

public class Singleton4 {

    private final String data;
    private static volatile Singleton4 instance;

    private Singleton4(String data) {
        this.data = data;
    }

    // TODO: every time to access to instance thread
    //  need to take it from main memory not from thread cache
    public static Singleton4 getInstance(String data) {

        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4(data);
                }
            }
        }
        return instance;
    }

    public String getData() {
        return data;
    }
}
