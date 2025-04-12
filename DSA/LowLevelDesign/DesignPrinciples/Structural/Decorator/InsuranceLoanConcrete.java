package LowLevelDesign.DesignPrinciples.Structural.Decorator;

// Concrete Decorator 1 - Adding Insurance
public class InsuranceLoanConcrete extends LoanDecoratorAbstract {
    InsuranceLoanConcrete(Loan loan) {
        super(loan);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "This is decorated";
    }

    @Override
    public double getCost() {
        return super.getCost() + 500;
    }
}
