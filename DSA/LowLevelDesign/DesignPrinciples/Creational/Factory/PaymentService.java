package LowLevelDesign.DesignPrinciples.Creational.Factory;

public class PaymentService {
    public void makePayment(String mode, double amount) {
        Payment payment = PaymentFactory.makePayment(mode);
        payment.processPayment(amount);
    }
}
