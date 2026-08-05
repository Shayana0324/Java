/*
* ClockHand class that describes a clock hand, which contains
* information about its value, upper limit (ie, the point at
* which the value of the hand returns to zero), and provides
* methods for advancing the hand, viewing its value, and also
* printing the value in string form.
* */
package src.ObjectOrientedPractice.Clock;

public class ClockHand {
    private int value;
    private int limit;

    public ClockHand(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    public void advance() {
        this.value = this.value + 1;

        if(this.value >= this.limit) {
            this.value = 0;
        }
    }

    public int value() {
        return this.value;
    }

    public String toString() {
        if(this.value < 10) {
            return "0" + this.value;
        }
        return "" + this.value;
    }
}
