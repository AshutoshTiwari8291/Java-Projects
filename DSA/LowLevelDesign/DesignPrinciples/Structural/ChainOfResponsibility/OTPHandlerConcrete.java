package LowLevelDesign.DesignPrinciples.Structural.ChainOfResponsibility;

public class OTPHandlerConcrete extends PaymentHandler{

    @Override
    public boolean handleRequest(double amount, String userId) {
        System.out.println("OTP verification completed");
        return true;
    }
}
