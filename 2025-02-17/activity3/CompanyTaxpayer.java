package activity3;

public class CompanyTaxpayer extends Taxpayer {
    private final int numberEmployees;

    public CompanyTaxpayer(String name, double annualIncome, int numberEmployees) {
        super(name, annualIncome);
        this.numberEmployees = numberEmployees;
    }

    public int getNumberEmployees() {
        return this.numberEmployees;
    }

    @Override
    public double calculateTaxes() {
        var rate = this.getNumberEmployees() > 10 ? 0.14 : 0.16;
        return this.getAnnualIncome() * rate;
    }
}
