package designpatterns.singleton;

public class Main {
    public static void main(String[] args) {

        System.out.println(Singleton1.getInstance());
        Singleton1 singleton = Singleton1.getInstance();
        System.out.println(singleton);


    }
}
