/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstruction;

abstract class BankAccount {

    protected double balance;

    // Constructor
    BankAccount(double balance) {
        this.balance = balance;
    }

    // Abstract methods
    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    // Display balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}


// SavingsAccount class
class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Savings Account Deposit: " + amount);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Savings Account Withdrawal: " + amount);
        } else {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }
}



class CurrentAccount extends BankAccount {

    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Current Account Deposit: " + amount);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Current Account Withdrawal: " + amount);
        } else {
            System.out.println("Insufficient balance in Current Account.");
        }
    }
}



public class Main {

    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount(5000);

        savings.displayBalance();
        savings.deposit(2000);
        savings.withdraw(1000);
        savings.displayBalance();

        System.out.println();

        CurrentAccount current = new CurrentAccount(10000);

        current.displayBalance();
        current.deposit(5000);
        current.withdraw(3000);
        current.displayBalance();
    }
}