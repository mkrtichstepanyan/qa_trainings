package designpatterns.homework_7.Heghine_Khachatryan.singleton;

public enum EnumSingleton {
    INSTANCE;

    EnumSingleton() {
        System.out.println("INSTANCE has been initialized here");
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println(EnumSingleton.getInstance());
    }
}