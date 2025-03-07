package activity4;

import java.util.Locale;
import java.util.Scanner;

import activity4.entities.Account;

public class Main {
    public static void main(String[] args) {
        Account account;
        double amountToWithdraw;

        try (var scanner = new Scanner(System.in)) {
            System.out.println("Enter account data");
            account = readAccount(scanner);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            amountToWithdraw = Double.parseDouble(scanner.nextLine());
        }

        try {
            account.withdraw(amountToWithdraw);
            System.out.printf(Locale.ROOT, "New balance: %.2f\n", account.getBalance());
        } catch (Exception e) {
            System.err.println("Withdraw error: " + e.getMessage());
        }
    }

    private static Account readAccount(Scanner scanner) {
        System.out.print("Number: ");
        var number = Integer.parseInt(scanner.nextLine());

        System.out.print("Holder: ");
        var holder = scanner.nextLine();

        System.out.print("Initial balance: ");
        var initialBalance = Double.parseDouble(scanner.nextLine());

        System.out.print("Withdraw limit: ");
        var withdrawLimit = Double.parseDouble(scanner.nextLine());

        return new Account(number, holder, initialBalance, withdrawLimit);
    }
}
