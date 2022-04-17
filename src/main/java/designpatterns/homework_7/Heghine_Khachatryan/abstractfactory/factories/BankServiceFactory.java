package designpatterns.homework_7.Heghine_Khachatryan.abstractfactory.factories;

import designpatterns.homework_7.Heghine_Khachatryan.abstractfactory.products.Deposit;
import designpatterns.homework_7.Heghine_Khachatryan.abstractfactory.products.Loan;

public abstract class BankServiceFactory {
    public abstract Loan loanProvider(String loan);
    public abstract Deposit depositProvider(String deposit);
}
