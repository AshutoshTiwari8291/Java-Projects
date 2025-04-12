package LowLevelDesign.ATM;

import LowLevelDesign.PaymentSystemDesign.BankAccount;

import java.util.HashMap;
import java.util.Map;

public class ATM {
    public double cashAvailable;
    public HashMap<Integer, Integer> cashDenominations;

    public ATM(double initalCash) {
        this.cashAvailable = initalCash;
        this.cashDenominations = new HashMap<>();
        cashDenominations.put(100, 10);
        cashDenominations.put(500, 2);
        cashDenominations.put(2000, 2);
    }

    public boolean authenticateUser(ATMCard card, int enteredPIN) {
        return card.getPin() == enteredPIN;
    }

    public void withdrawMoney(BankAccount account, double amount) {
//        if (amount > cashAvailable || amount > account.getBalance()) {
//            System.out.println("Insufficient Funds!");
//            return false;
//        }
//
//        Map<Integer, Integer> dispensedNotes = dispenseCash(amount);
//        if (dispensedNotes == null) {
//            System.out.println("ATM does not have required denominations!");
//            return false;
//        }
    }
}
