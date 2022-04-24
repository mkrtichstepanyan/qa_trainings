package designpatterns.homework_7.Heghine_Khachatryan.proxy;

public class MainDemo {
    public static void main(String[] args) {
        Operations operations = new ProxyOperation("Admin");
        Operations operations1 = new ProxyOperation("Admin");
        Operations operations2 = new ProxyOperation("Admin");
        operations.edit();
        operations.view();

        operations1.edit();
        operations1.view();

        operations2.edit();
        operations2.view();
    }
}
