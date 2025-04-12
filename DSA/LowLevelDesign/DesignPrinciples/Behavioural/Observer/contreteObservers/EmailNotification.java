package LowLevelDesign.DesignPrinciples.Behavioural.Observer.contreteObservers;

import LowLevelDesign.DesignPrinciples.Behavioural.Observer.Observer;

public class EmailNotification implements Observer {
    public String email;
    public EmailNotification(String email) {
        this.email = email;
    }

    @Override
    public void update(String message) {
        System.out.println("Here it goes email " + email + message);
    }
}
