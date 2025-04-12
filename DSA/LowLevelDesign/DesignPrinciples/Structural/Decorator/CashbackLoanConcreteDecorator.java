package LowLevelDesign.DesignPrinciples.Structural.Decorator;

public class CashbackLoanConcreteDecorator extends LoanDecoratorAbstract {
    CashbackLoanConcreteDecorator(Loan loan) {
        super(loan);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Adding the cashback offer";
    }

    @Override
    public double getCost() {
        return super.getCost() - 100;
    }
}
