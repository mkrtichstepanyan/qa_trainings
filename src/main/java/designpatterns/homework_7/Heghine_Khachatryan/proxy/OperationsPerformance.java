package designpatterns.homework_7.Heghine_Khachatryan.proxy;

public class OperationsPerformance implements Operations{

    @Override
    public void view() {
        System.out.println("View operation is performing...");
    }

    @Override
    public void edit() {
        System.out.println("Edit operation is performing...");
    }
}
