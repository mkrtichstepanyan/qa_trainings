package designpatterns.homework_7.Heghine_Khachatryan.abstractfactory.factories;

import designpatterns.homework_7.Heghine_Khachatryan.abstractfactory.products.*;

public class AraratBankServiceFactory extends BankServiceFactory {

    @Override
    public Loan loanProvider(String loan) {
        if (loan.equalsIgnoreCase("mortgage")) {
            return new Mortgage();
        } else if (loan.equalsIgnoreCase("salary")) {
            return new SalaryLoan();
        } else {
            return null;
        }
    }

    @Override
    public Deposit depositProvider(String deposit) {
        if (deposit.equalsIgnoreCase("standard")) {
            return new StandardDeposit();
        } else if (deposit.equalsIgnoreCase("comfort")) {
            return new ComfortDeposit();
        } else {
            return null;
        }
    }
}