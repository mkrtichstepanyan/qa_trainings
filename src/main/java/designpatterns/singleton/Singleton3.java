package designpatterns.singleton;

public class Singleton3 {

    private final String data;
    private static Singleton3 instance;

    private Singleton3(String data) {
        this.data = data;
    }

    // TODO: Improving performance.
    //       Partial initial object can be shared with other threads
    public static Singleton3 getInstance(String data) {

        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3(data);
                }
            }
        }
        return instance;
    }

    public String getData() {
        return data;
    }
}
