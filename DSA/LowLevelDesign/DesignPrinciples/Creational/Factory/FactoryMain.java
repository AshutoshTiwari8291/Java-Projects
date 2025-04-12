package LowLevelDesign.DesignPrinciples.Creational.Factory;

public class FactoryMain {
    public static void main() {
        PaymentService paymentService = new PaymentService();
        paymentService.makePayment("Credit", 12);
    }
}
