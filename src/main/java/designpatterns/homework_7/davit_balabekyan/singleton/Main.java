package designpatterns.homework_7.davit_balabekyan.singleton;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        EnumSingleton singleton = EnumSingleton.INSTANCE;

        System.out.println(singleton.getName());
        System.out.println(singleton.getAge());
    }
}
