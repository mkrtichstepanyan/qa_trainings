package designpatterns.homework_7.Heghine_Khachatryan.singleton;

public class InitializationOnDemandHolder {

    private InitializationOnDemandHolder() {}

    private static class InitSingleton {
        final static InitializationOnDemandHolder INSTANCE = new InitializationOnDemandHolder();
    }

    public static InitializationOnDemandHolder getInstance() {
        return InitSingleton.INSTANCE;
    }
}