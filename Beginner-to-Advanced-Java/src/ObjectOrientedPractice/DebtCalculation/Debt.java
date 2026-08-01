package src.ObjectOrientedPractice.DebtCalculation;

public class Debt {
    private double balance;
    private double interestRate;

    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }

    public void printBalance() {
        System.out.println("Current Balance: " + this.balance);
    }

    public void waitOneYear() {
        System.out.println("Debt amount: " + (this.balance * this.interestRate));
    }
}
