package LowLevelDesign.DesignPrinciples.Creational.Builder;

public class BankAccount {

    // Required parameters
    private final String accountHolderName;
    private final String accountNumber;


    // optional parameters
    private final String accountType; // Saving, current
    private final double balance;
    private final boolean overdraftProtection;

    private BankAccount(BankAccountBuilder  builder) {
        this.accountHolderName = builder.accountHolderName;
        this.accountNumber = builder.accountNumber;
        this.accountType = builder.accountType;
        this.balance = builder.balance;
        this.overdraftProtection = builder.overdraftProtection;
    }

    // Getters (No setters to ensure immutability)
    public String getAccountHolderName() { return accountHolderName; }
    public String getAccountNumber() { return accountNumber; }
    public String getAccountType() { return accountType; }
    public double getBalance() { return balance; }
    public boolean hasOverdraftProtection() { return overdraftProtection; }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountType='" + accountType + '\'' +
                ", balance=" + balance +
                ", overdraftProtection=" + overdraftProtection +
                '}';
    }

    public static class BankAccountBuilder {
        private final String accountHolderName;
        public final String accountNumber;
        private String accountType;
        private double balance;
        private boolean overdraftProtection;

        // Constructor for required fields
        public BankAccountBuilder(String accountHolderName, String accountNumber) {
            this.accountHolderName = accountHolderName;
            this.accountNumber = accountNumber;
        }

        public BankAccountBuilder setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }

        public BankAccountBuilder setBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public BankAccountBuilder setOverdraftProtection(boolean overdraftProtection) {
            this.overdraftProtection = overdraftProtection;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }



}
