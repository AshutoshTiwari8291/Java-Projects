package LowLevelDesign.DesignPrinciples.Creational.AbstractFactory;

import java.util.Scanner;

// Let's implement an Abstract Factory Pattern where we support multiple payment gateways (Stripe, PayPal) and multiple payment methods (Credit Card, UPI).
public class AbstractPaymentMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Payment Gateway (Stripe/PayPal): ");
        String gateway = scanner.nextLine();

        System.out.print("Enter Payment Method (CreditCard/UPI): ");
        String method = scanner.nextLine();

        System.out.print("Enter Payment Amount: ");
        double amount = scanner.nextDouble();

        PaymentFactory factory = PaymentFactoryProducer.getFactory(gateway);

        Payment payment;
        if (method.equalsIgnoreCase("CreditCard")) {
            payment = factory.getCreditCardPayment();
        } else if (method.equalsIgnoreCase("UPI")) {
            payment = factory.getUPIPayment();
        } else {
            throw new IllegalArgumentException("Invalid Payment Method: " + method);
        }

        payment.makePayment(amount);
    }
}
