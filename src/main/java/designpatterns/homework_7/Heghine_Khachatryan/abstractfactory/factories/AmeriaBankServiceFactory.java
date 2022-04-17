package designpatterns.homework_7.Heghine_Khachatryan.abstractfactory.factories;

import designpatterns.homework_7.Heghine_Khachatryan.abstractfactory.products.Deposit;
import designpatterns.homework_7.Heghine_Khachatryan.abstractfactory.products.Loan;
import designpatterns.homework_7.Heghine_Khachatryan.abstractfactory.products.SalaryLoan;
import designpatterns.homework_7.Heghine_Khachatryan.abstractfactory.products.StandardDeposit;

public class AmeriaBankServiceFactory extends BankServiceFactory {

    @Override
    public Loan loanProvider() {
        return new SalaryLoan();
    }

    @Override
    public Deposit depositProvider() {
        return new StandardDeposit();
    }

}
