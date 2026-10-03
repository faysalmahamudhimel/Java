package bank;

import java.util.ArrayList;

public class Bank {

    // Collection of accounts
    private ArrayList<Account> accounts;

    // Bank constructor
    public Bank() {
        accounts = new ArrayList<>();
    }

    // Add account
    public void addAccount(Account account) {

        accounts.add(account);

        System.out.println("Account added successfully.");
    }

    // Remove account
    public void removeAccount(int accountNumber) {

        for (Account account : accounts) {

            if (account.getAccountNumber() == accountNumber) {

                accounts.remove(account);

                System.out.println("Account removed successfully.");

                return;
            }
        }

        System.out.println("Account not found.");
    }

    // Find account
    public Account findAccount(int accountNumber) {

        for (Account account : accounts) {

            if (account.getAccountNumber() == accountNumber) {

                return account;
            }
        }

        return null;
    }

    // Display all accounts
    public void displayAllAccounts() {

        for (Account account : accounts) {

            account.displayAccount();

            System.out.println("--------------------");
        }
    }
}