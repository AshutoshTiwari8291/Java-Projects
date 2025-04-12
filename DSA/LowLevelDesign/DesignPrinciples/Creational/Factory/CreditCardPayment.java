package LowLevelDesign.DesignPrinciples.Creational.Factory;

public class CreditCardPayment implements Payment{

    @Override
    public void processPayment(double amount) {
        System.out.println("The payment is done using credit card");
    }
}
