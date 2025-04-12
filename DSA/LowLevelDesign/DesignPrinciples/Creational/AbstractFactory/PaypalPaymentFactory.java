package LowLevelDesign.DesignPrinciples.Creational.AbstractFactory;

import LowLevelDesign.DesignPrinciples.Creational.AbstractFactory.paypal.PaypalCreditcard;
import LowLevelDesign.DesignPrinciples.Creational.AbstractFactory.paypal.PaypalUPI;

public class PaypalPaymentFactory extends PaymentFactory {
    @Override
    public Payment getCreditCardPayment() {
        return new PaypalCreditcard();
    }

    @Override
    public Payment getUPIPayment() {
        return new PaypalUPI();
    }
}
