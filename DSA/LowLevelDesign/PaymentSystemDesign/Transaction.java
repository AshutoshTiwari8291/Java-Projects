package LowLevelDesign.PaymentSystemDesign;

import java.util.UUID;

public class Transaction {
    private UUID transactionId;
    private User user;
    private Merchant merchant;
    private double amount;
    private String status; // SUCESS, FALIURE, REFUND, PENDING

    Transaction(User user, Merchant merchant, double amount, String status) {
        this.user = user;
        this.merchant = merchant;
        this.amount = amount;
        this.status = status;
    }
}
