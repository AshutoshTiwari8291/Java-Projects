package LowLevelDesign.DesignPrinciples.Behavioural.Observer.contreteObservers;

import LowLevelDesign.DesignPrinciples.Behavioural.Observer.Observer;

public class SMSNotifiaction implements Observer {
    public String phoneNumber;

    public SMSNotifiaction(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String message) {
        System.out.println("Here it goes message on this number " + phoneNumber + message);
    }
}
