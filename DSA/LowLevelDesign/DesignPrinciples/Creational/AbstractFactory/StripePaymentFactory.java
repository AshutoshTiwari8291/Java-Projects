package LowLevelDesign.DesignPrinciples.Creational.AbstractFactory;

import LowLevelDesign.DesignPrinciples.Creational.AbstractFactory.stripe.StripeCreditCardPayment;
import LowLevelDesign.DesignPrinciples.Creational.AbstractFactory.stripe.StripeUPI;

public class StripePaymentFactory extends PaymentFactory{
    @Override
    public Payment getCreditCardPayment() {
        return new StripeCreditCardPayment();
    }

    @Override
    public Payment getUPIPayment() {
        return new StripeUPI();
    }
}
