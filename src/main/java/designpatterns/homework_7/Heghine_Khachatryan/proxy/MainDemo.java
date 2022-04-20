package designpatterns.homework_7.Heghine_Khachatryan.proxy;

public class MainDemo {
    public static void main(String[] args) {
        Operations operations = new ProxyOperation("Admin");
        operations.edit();
        operations.view();
    }
}
