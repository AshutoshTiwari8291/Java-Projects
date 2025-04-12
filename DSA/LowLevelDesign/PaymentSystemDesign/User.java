package LowLevelDesign.PaymentSystemDesign;

import java.util.List;

public class User {
    private int userId;
    private String name;
    public BankAccount bankAccount;
    private List<Card> cards;

    public boolean makePayment() {
        return true;
    }
}
