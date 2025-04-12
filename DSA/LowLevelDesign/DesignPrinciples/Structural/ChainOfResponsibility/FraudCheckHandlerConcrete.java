package LowLevelDesign.DesignPrinciples.Structural.ChainOfResponsibility;

public class FraudCheckHandlerConcrete extends PaymentHandler{
    @Override
    public boolean handleRequest(double amount, String userId) {
        System.out.println("Fraud check passed!");
        if(nextHandler != null) return nextHandler.handleRequest(amount, userId);
        return false;
    }
}
