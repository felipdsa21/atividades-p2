package activity3;

public class IndividualTaxpayer extends Taxpayer {
    private final double healthExpenditures;

    public IndividualTaxpayer(String name, double annualIncome, double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return this.healthExpenditures;
    }

    @Override
    public double calculateTaxes() {
        var rate = this.getAnnualIncome() < 20_000.00 ? 0.15 : 0.25;
        return this.getAnnualIncome() * rate - this.getHealthExpenditures() * 0.50;
    }
}
