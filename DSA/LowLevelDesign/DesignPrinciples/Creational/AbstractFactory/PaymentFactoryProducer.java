package LowLevelDesign.DesignPrinciples.Creational.AbstractFactory;

public class PaymentFactoryProducer {
    public static PaymentFactory getFactory(String gateway) {
        if (gateway.equalsIgnoreCase("STRIPE")) {
            return new StripePaymentFactory();
        } else if (gateway.equalsIgnoreCase("PAYPAL")) {
            return new PaypalPaymentFactory();
        } else {
            throw new IllegalArgumentException("Invalid payment mode! Please choose another");
        }
    }
}
