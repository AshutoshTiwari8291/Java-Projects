package LowLevelDesign.DesignPrinciples.Structural.Decorator;

public abstract class LoanDecoratorAbstract implements Loan {
    protected Loan decoratedLoan;

    LoanDecoratorAbstract(Loan loan) {
        this.decoratedLoan = loan;
    }

    @Override
    public String getDescription() {
        return decoratedLoan.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedLoan.getCost();
    }
}
