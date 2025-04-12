package LowLevelDesign.DesignPrinciples.Structural.ChainOfResponsibility;

public abstract class PaymentHandler {
    protected PaymentHandler nextHandler;

    public void setNextHandler(PaymentHandler paymentHandler) {
        this.nextHandler = paymentHandler;
    }

    public abstract boolean handleRequest(double amount, String userId);
}
