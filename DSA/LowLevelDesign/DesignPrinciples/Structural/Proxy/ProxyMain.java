package LowLevelDesign.DesignPrinciples.Structural.Proxy;

public class ProxyMain {
    public static void main(String[] args) {
//        RealBankAccount bankAccount = new BankAccountProxy("Ashutosh", "Password123", 1200);
    }
}


interface A {
    default void a() {
        System.out.println("Hello");
    }
}
