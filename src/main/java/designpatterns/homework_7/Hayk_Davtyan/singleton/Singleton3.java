package designpatterns.homework_7.Hayk_Davtyan.singleton;

public class Singleton3 {
    private final String data;
    private static Singleton3 instance;

    private Singleton3(String data){this.data = data;}

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

    public String getData() {return data;}
}
