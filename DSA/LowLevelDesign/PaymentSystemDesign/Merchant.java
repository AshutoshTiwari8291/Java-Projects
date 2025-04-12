package LowLevelDesign.PaymentSystemDesign;

public class Merchant {
    public int merchantId;
    private String name;
    private BankAccount merchantAccount;

    public void receivePayment(double amount) {
        merchantAccount.deposit(amount);
    }
}
