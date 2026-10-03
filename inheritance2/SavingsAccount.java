package inheritance2;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    // Overriding withdraw()
    @Override
    public void withdraw(double amount) {

        if (balance - amount < 100) {
            System.out.println("Withdrawal not allowed.");
            System.out.println("Balance cannot fall below 100.");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        }
    }
}