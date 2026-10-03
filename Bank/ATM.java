package bank;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create Bank object
        Bank bank = new Bank();

        // Create accounts
        Account a1 = new Account(001, "Himel", 10000);
        Account a2 = new Account(002, "Lily", 30000);

        // Add accounts to bank
        bank.addAccount(a1);
        bank.addAccount(a2);

        int choice;

        do {

            System.out.println("\n ATM MENU");
            System.out.println("1. Display All Accounts");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Remove Account");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:

                    bank.displayAllAccounts();

                    break;

                case 2:

                    System.out.print("Enter Account Number: ");
                    int depositAccount = input.nextInt();

                    Account account1 = bank.findAccount(depositAccount);

                    if (account1 != null) {

                        System.out.print("Enter deposit amount: ");
                        double depositAmount = input.nextDouble();

                        account1.deposit(depositAmount);

                    } else {

                        System.out.println("Account not found.");
                    }

                    break;

                case 3:

                    System.out.print("Enter Account Number: ");
                    int withdrawAccount = input.nextInt();

                    Account account2 = bank.findAccount(withdrawAccount);

                    if (account2 != null) {

                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = input.nextDouble();

                        account2.withdraw(withdrawAmount);

                    } else {

                        System.out.println("Account not found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Account Number: ");
                    int removeAccount = input.nextInt();

                    bank.removeAccount(removeAccount);

                    break;

                case 5:

                    System.out.println("Thank you for using ATM.");

                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        input.close();
    }
}