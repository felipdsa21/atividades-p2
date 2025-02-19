package activity3;

public abstract class Taxpayer {
    private final String name;
    private final double annualIncome;

    public Taxpayer(String name, double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return this.name;
    }

    public double getAnnualIncome() {
        return this.annualIncome;
    }

    public abstract double calculateTaxes();
}
