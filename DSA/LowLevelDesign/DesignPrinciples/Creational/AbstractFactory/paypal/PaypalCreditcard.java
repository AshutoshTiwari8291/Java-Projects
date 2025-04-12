package LowLevelDesign.DesignPrinciples.Creational.AbstractFactory.paypal;

import LowLevelDesign.DesignPrinciples.Creational.AbstractFactory.Payment;

public class PaypalCreditcard implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paypal credit card" + amount);
    }
}
