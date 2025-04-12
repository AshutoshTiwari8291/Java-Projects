package LowLevelDesign.DesignPrinciples.Creational.AbstractFactory.stripe;

import LowLevelDesign.DesignPrinciples.Creational.AbstractFactory.Payment;

public class StripeCreditCardPayment implements Payment {

    @Override
    public void makePayment(double amount) {
        System.out.println("Stripe credit card" + amount);
    }
}
