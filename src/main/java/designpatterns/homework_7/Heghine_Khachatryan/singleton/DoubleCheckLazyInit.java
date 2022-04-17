package designpatterns.homework_7.Heghine_Khachatryan.singleton;

public class DoubleCheckLazyInit {
    private static volatile DoubleCheckLazyInit instance;

    private DoubleCheckLazyInit() {}

    public static DoubleCheckLazyInit getInstance(){
        if (instance == null) {
            synchronized (DoubleCheckLazyInit.class) {
                if (instance == null) {
                    instance = new DoubleCheckLazyInit();
                }
            }
        }
        return instance;
    }
}