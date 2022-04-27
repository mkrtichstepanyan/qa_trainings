package designpatterns.homework_7.Heghine_Khachatryan.abstractfactory.products;

public class StandardDeposit implements Deposit {
    @Override
    public void provide() {
        System.out.println("Ameria Bank provides Standard deposit");
    }
}