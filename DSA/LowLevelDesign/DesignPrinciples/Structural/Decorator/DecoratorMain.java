package LowLevelDesign.DesignPrinciples.Structural.Decorator;

import LowLevelDesign.DesignPrinciples.Structural.Decorator.concrete.BasicLoan;

public class DecoratorMain {

    public static void main(String[] args) {
        Loan loan = new BasicLoan();

        System.out.println(loan.getDescription() + " | Cost: $" + loan.getCost());

        loan = new InsuranceLoanConcrete(loan);

        System.out.println(loan.getDescription() + " | Cost: $" + loan.getCost());

        loan = new CashbackLoanConcreteDecorator(loan);

        System.out.println(loan.getDescription() + " | Cost: $" + loan.getCost());

    }
}
