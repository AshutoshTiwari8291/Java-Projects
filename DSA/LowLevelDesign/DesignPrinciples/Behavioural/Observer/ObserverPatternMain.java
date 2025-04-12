package LowLevelDesign.DesignPrinciples.Behavioural.Observer;

import LowLevelDesign.DesignPrinciples.Behavioural.Observer.contreteObservers.EmailNotification;
import LowLevelDesign.DesignPrinciples.Behavioural.Observer.contreteObservers.SMSNotifiaction;

public class ObserverPatternMain {
    public static void main(String[] args) {
        BankTransactionSubject bankSubject = new BankTransactionSubject();

        Observer emailObserver = new EmailNotification("ashutosh.tiwari@gmail.com");
        Observer smsOberver = new SMSNotifiaction("9413258291");


        bankSubject.addObserver(emailObserver);
        bankSubject.addObserver(smsOberver);

        bankSubject.performTransaction("4 Lakh transferred to Ashutosh Account");
    }
}
