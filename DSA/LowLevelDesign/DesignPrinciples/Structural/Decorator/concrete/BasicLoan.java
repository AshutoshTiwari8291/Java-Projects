package LowLevelDesign.DesignPrinciples.Structural.Decorator.concrete;

import LowLevelDesign.DesignPrinciples.Structural.Decorator.Loan;

public class BasicLoan implements Loan {
    @Override
    public String getDescription() {
        return "Basic Loan";
    }

    @Override
    public double getCost() {
        return 50000;
    }
}
