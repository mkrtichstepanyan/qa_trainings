package designpatterns.homework_7.Heghine_Khachatryan.abstractfactory.products;

public class ComfortDeposit implements Deposit {
    @Override
    public void provide() {
        System.out.println("Ararat Bank provides Comfort deposit");
    }
}
