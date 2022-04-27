package designpatterns.homework_7.anjela_melqonyan.singleton;

public class Singleton1 {
    private static Singleton1 instanse;
    private Singleton1() {
    }

    public static Singleton1 getInstance () {
        if (instanse == null) {
            instanse=new Singleton1();
        }
        return instanse;

    }
}
