package designpatterns.homework_7.Heghine_Khachatryan.abstractfactory.factories;

import designpatterns.homework_7.Heghine_Khachatryan.abstractfactory.products.ComfortDeposit;
import designpatterns.homework_7.Heghine_Khachatryan.abstractfactory.products.Deposit;
import designpatterns.homework_7.Heghine_Khachatryan.abstractfactory.products.Loan;
import designpatterns.homework_7.Heghine_Khachatryan.abstractfactory.products.Mortgage;

public class AraratBankServiceFactory extends BankServiceFactory {

    @Override
    public Loan loanProvider() {
        return new Mortgage();
    }

    @Override
    public Deposit depositProvider() {
        return new ComfortDeposit();
    }
}
