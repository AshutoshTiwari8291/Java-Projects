package LowLevelDesign.DesignPrinciples.Structural.Proxy;

public class RealBankAccount implements BankAccount{
    private String accountHolder;
    private double balance;

    public RealBankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    @Override
    public void showBalance() {
        System.out.println(accountHolder + "'s Account Balance: $" + balance);
    }
}
