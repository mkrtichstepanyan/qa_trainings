package designpatterns.homework_7.Heghine_Khachatryan.abstractfactory.products;

public class SalaryLoan implements Loan {
    @Override
    public void provide() {
        System.out.println("Ameria Bank provides Salary loans");
    }
}
