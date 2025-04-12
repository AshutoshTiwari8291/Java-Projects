package LowLevelDesign.DesignPrinciples.Creational.Factory;

public class UPIPayment implements Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("The payment is done using UPI");
    }
}
