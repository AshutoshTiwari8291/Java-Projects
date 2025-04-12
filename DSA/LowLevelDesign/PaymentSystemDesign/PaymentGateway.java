package LowLevelDesign.PaymentSystemDesign;

public class PaymentGateway {
    public boolean processPayment(User user, Card card, Merchant merchant, double amount) {
        BankAccount bankAccount = user.bankAccount;
        if (bankAccount.withdraw(amount)) {
            merchant.receivePayment(amount);
            Transaction transaction = new Transaction(user, merchant, amount, "Success");
            return true;
        }
        return false;
    }
}
