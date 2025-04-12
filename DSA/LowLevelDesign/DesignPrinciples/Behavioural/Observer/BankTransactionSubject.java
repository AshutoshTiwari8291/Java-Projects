package LowLevelDesign.DesignPrinciples.Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public class BankTransactionSubject {
    private List<Observer> observerList = new ArrayList<>();

    void addObserver(Observer observer) {
        observerList.add(observer);
    }

    void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    void notifyObservers(String message) {
        for (Observer observer: observerList) {
            observer.update(message);
        }
    }

    public void performTransaction(String transactionDetails) {
        System.out.println("Transaction completed: " + transactionDetails);
        notifyObservers("Transaction Alert: " + transactionDetails);
    }
}
