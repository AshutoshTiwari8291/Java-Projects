package LowLevelDesign.DesignPrinciples.Creational.Factory;

public class PaymentFactory {
    public static Payment makePayment(String mode) {
        return switch (mode.toUpperCase()) {
            case "CREDIT" -> new CreditCardPayment();
            case "PAYPAL" -> new UPIPayment();
            case "UPI" -> new UPIPayment();
            default -> throw new IllegalArgumentException("Invalid payment mode:" + mode);
        };
    }
}
