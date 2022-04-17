package designpatterns.homework_7.Heghine_Khachatryan.builder;

public class BankAccount {
    private final int accountNumber;
    private final String accountHolder;
    private final long accountBalance;
    private final double interestOnAccount;
    private final String bankBranch;

    private BankAccount(Builder builder) {
        this.accountNumber = builder.accountNumber;
        this.accountHolder = builder.accountHolder;
        this.accountBalance = builder.accountBalance;
        this.interestOnAccount = builder.interestOnAccount;
        this.bankBranch = builder.bankBranch;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountBalance=" + accountBalance +
                ", persentageOnAccount=" + interestOnAccount +
                ", bankBranch='" + bankBranch + '\'' +
                '}';
    }

    public static class Builder {
        private int accountNumber;
        private String accountHolder;
        private long accountBalance;
        private double interestOnAccount;
        private String bankBranch;

        public Builder accountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder accountHolder(String accountHolder) {
            this.accountHolder = accountHolder;
            return this;
        }

        public Builder accountBalance(long accountBalance) {
            this.accountBalance = accountBalance;
            return this;
        }

        public Builder interestOnAccount(double interestOnAccount) {
            this.interestOnAccount = interestOnAccount;
            return this;
        }

        public Builder bankBranch(String bankBranch) {
            this.bankBranch = bankBranch;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }
}
