package LowLevelDesign.DesignPrinciples.Creational.Builder;

public class BuilderMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount.BankAccountBuilder("Ashutosh", "123456").build();

        System.out.println(bankAccount);

        BankAccount bankAccountWithDetails = new BankAccount.BankAccountBuilder("T", "123456")
                .setAccountType("Current")
                .setOverdraftProtection(true)
                .setBalance(11)
                .build();

        System.out.println(bankAccountWithDetails);

    }
}
