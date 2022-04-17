package designpatterns.homework_7.Heghine_Khachatryan.builder;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount.Builder()
                .accountNumber(1510020030)
                .accountHolder("Heghine")
                .accountBalance(20000L)
                .interestOnAccount(1.5)
                .bankBranch("Shirak")
                .build();
        System.out.println(bankAccount);
    }
}