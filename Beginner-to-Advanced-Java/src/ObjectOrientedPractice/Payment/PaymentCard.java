package src.ObjectOrientedPractice.Payment;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return("This card has a balance of " + this.balance + " euros");
    }

    public void earAffordable() {
        this.balance = this.balance - 2.60;
    }

    public void eatHeartily() {
        this.balance = this.balance - 4.60;
    }
}
