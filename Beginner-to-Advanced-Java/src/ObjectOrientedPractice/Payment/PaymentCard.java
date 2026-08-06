package src.ObjectOrientedPractice.Payment;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public double balance() {
        return this.balance;
    }

    public String toString() {
        return("This card has a balance of " + this.balance + " euros");
    }

    public void earAffordable() {
        if(this.balance >= 2.60) {
            this.balance = this.balance - 2.60;
        }
    }

    public void eatHeartily() {
        if(this.balance >= 4.60) {
            this.balance = this.balance - 4.60;
        }
    }

//    public void addMoney(double amount) {
//        // Check if the deposit is positive to prevent adding negative amounts
//        if(amount > 0) {
//            this.balance += amount;
//        }
//
//        // Cap the balance at exactly 150.0 euros if it goes over
//        if(this.balance > 150.0) {
//            this.balance = 150.0;
//        }
//    }
    public void addMoney(double increase) {
        this.balance = this.balance + increase;
    }

    public boolean takeMoney(double amount) {
        if (this.balance <= amount) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
