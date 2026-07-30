package src.ObjectOrientedPractice;

public class Account {
    private double balance;
    private String owner;

    // Constructor
    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    // Method to deposit money
    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    // Method to check current balance
    public double balance() {
        return this.balance;
    }

    // Custom string representation of the object
    @Override
    public String toString() {
        return this.owner + " balance: " + this.balance;
    }

}
