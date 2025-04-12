package LowLevelDesign.DesignPrinciples.Creational.AbstractFactory.stripe;

import LowLevelDesign.DesignPrinciples.Creational.AbstractFactory.Payment;

public class StripeUPI implements Payment {

    @Override
    public void makePayment(double amount) {
        System.out.println("Stripe UPI Done" + amount);
    }
}
