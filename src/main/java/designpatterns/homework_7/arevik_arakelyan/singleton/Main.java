package designpatterns.homework_7.arevik_arakelyan.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println(Singleton1.getInstance()  );
        Singleton1 singleton = Singleton1.getInstance();
        System.out.println(singleton);
        System.out.println(Singleton2.getInstance("5")  );
        Singleton2 singleton1 = Singleton2.getInstance("4");
        System.out.println(singleton1);

    }
}
