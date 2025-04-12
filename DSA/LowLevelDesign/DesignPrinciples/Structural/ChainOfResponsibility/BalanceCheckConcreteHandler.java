package LowLevelDesign.DesignPrinciples.Structural.ChainOfResponsibility;

public class BalanceCheckConcreteHandler extends PaymentHandler{

    @Override
    public boolean handleRequest(double amount, String userId) {
        System.out.println("Balance Check Passed for User: " + userId);
        if (nextHandler != null) return nextHandler.handleRequest(amount, userId);
        return true;
    }
}
