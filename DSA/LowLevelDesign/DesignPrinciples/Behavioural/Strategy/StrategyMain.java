package LowLevelDesign.DesignPrinciples.Behavioural.Strategy;

public class StrategyMain {
    public static void main(String[] args) {

        PaymentProcessor strategy = new PaymentProcessor();
        strategy.setPaymentStrategy(new CreditCardPayment());


        strategy.processPayment(1000);

    }
}
