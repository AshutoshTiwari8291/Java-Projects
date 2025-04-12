package LowLevelDesign.DesignPrinciples.Structural.ChainOfResponsibility;

public class PaymentProcessorMain {
    public static void main(String[] args) {
        BalanceCheckConcreteHandler balanceCheckConcreteHandler = new BalanceCheckConcreteHandler();
        FraudCheckHandlerConcrete fraudCheckHandlerConcrete = new FraudCheckHandlerConcrete();
        OTPHandlerConcrete otpHandlerConcrete = new OTPHandlerConcrete();

        balanceCheckConcreteHandler.setNextHandler(fraudCheckHandlerConcrete);
        fraudCheckHandlerConcrete.setNextHandler(otpHandlerConcrete);

        System.out.println("\nProcessing Payment for User: U123  ----------->");
        boolean paymentSuccess = balanceCheckConcreteHandler.handleRequest(100.00, "U123");

        if (paymentSuccess) {
            System.out.println("\n Hooray!!!!!!!!!! Payment Successfully Processed!");
        } else {
            System.out.println("\n Payment Failed Due to Validation Issue!");
        }
    }
}
