package LowLevelDesign.DesignPrinciples.Behavioural.Strategy;

public class PaymentProcessor {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void processPayment(double amount) {
        paymentStrategy.pay(amount);
    }
}

