package LowLevelDesign.DesignPrinciples.Structural.Proxy;

public class BankAccountProxy implements BankAccount{
    private RealBankAccount realBankAccount;
    private String accountHolder;
    private String password;

    public BankAccountProxy(String accountHolder, String password, double balance) {
        this.accountHolder = accountHolder;
        this.password = password;
        this.realBankAccount = new RealBankAccount(accountHolder, balance);
    }

    boolean authenticate() {
        return "Password123".equals(password);
    }

    @Override
    public void showBalance() {
        if (authenticate()) {
            realBankAccount.showBalance();
        } else {
            System.out.println("Authentication failed. Access denied!");
        }
    }
}
