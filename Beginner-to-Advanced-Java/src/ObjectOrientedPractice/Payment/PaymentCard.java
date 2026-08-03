package src.ObjectOrientedPractice.Payment;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return("This card has a balance of " + this.balance + " euros");
    }
}
