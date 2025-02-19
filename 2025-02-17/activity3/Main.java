package activity3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Taxpayer> taxpayers;

        try (var scanner = new Scanner(System.in)) {
            taxpayers = getTaxpayers(scanner);
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        var totalTaxes = 0.00;

        for (var taxpayer : taxpayers) {
            var taxes = taxpayer.calculateTaxes();
            System.out.printf(Locale.ROOT, "%s: $ %.2f\n", taxpayer.getName(), taxes);
            totalTaxes += taxes;
        }

        System.out.println();
        System.out.printf(Locale.ROOT, "TOTAL TAXES: $ %.2f\n", totalTaxes);
    }

    private static List<Taxpayer> getTaxpayers(Scanner scanner) {
        System.out.print("Enter the number of tax payers: ");
        var numberPayers = Integer.parseInt(scanner.nextLine());
        var taxpayers = new ArrayList<Taxpayer>(numberPayers);

        for (var i = 0; i < numberPayers; i++) {
            System.out.printf(Locale.ROOT, "Tax payer #%d data:\n", i + 1);
            taxpayers.add(getTaxpayer(scanner));
        }

        return taxpayers;
    }

    private static Taxpayer getTaxpayer(Scanner scanner) {
        System.out.print("Individual or company (i/c)? ");
        var type = scanner.nextLine();

        System.out.print("Name: ");
        var name = scanner.nextLine();

        System.out.print("Anual income: ");
        var annualIncome = Double.parseDouble(scanner.nextLine());

        if ("c".equals(type)) {
            System.out.print("Number of employees: ");
            var numberEmployees = Integer.parseInt(scanner.nextLine());
            return new CompanyTaxpayer(name, annualIncome, numberEmployees);
        } else {
            System.out.print("Health expenditures: ");
            var healthExpenditures = Double.parseDouble(scanner.nextLine());
            return new IndividualTaxpayer(name, annualIncome, healthExpenditures);
        }
    }
}
