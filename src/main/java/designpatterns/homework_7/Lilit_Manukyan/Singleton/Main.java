package designpatterns.homework_7.Lilit_Manukyan.Singleton;

import designpatterns.singleton.Singleton1;

public class Main {
    public static void main(String[] args) {

        System.out.println(Singleton1.getInstance());
        Singleton1 singleton = Singleton1.getInstance();
        System.out.println(singleton);

    }
}
