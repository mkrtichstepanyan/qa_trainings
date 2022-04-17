package designpatterns.homework_7.Heghine_Khachatryan.abstractfactory.products;

public class Mortgage implements Loan {

    @Override
    public void provide() {
        System.out.println("Ararat Bank provides Mortgage Loan");
    }
}
