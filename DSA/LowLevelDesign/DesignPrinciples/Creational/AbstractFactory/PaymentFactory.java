package LowLevelDesign.DesignPrinciples.Creational.AbstractFactory;

public abstract class PaymentFactory {
    public abstract Payment getCreditCardPayment();
    public abstract Payment getUPIPayment();
}
