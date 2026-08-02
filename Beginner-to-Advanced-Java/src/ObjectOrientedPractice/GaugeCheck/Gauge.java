package src.ObjectOrientedPractice.GaugeCheck;

public class Gauge {
    private int value;

    public Gauge() {
       int initialMeterValue = 0;
    }

    /*
    * Method public void increase()
    * grows the value instance
    * variable's value by one. It does not grow the value
    * beyond five.
    * */
    public void increase() {
        if(this.value <= 5) {
            this.value = this.value + 1;
        }
    }

    /*
    * Method public void decrease()
    * decreases the value instance variable's value by
    * one. It does not decrease the value to
    * negative numbers.
    * */
    public void decrease() {
        if(this.value >=0) {
            this.value = this.value - 1;
        }
    }

    /*
    * Method public int value()
    * Returns the value variable's value.
    * */
    public int value() {
        return this.value;
    }

    /*
    * Method public boolean full()
    * Returns true if the instance variable value has the
    * value five. Otherwise, it Returns false.
    * */
    public boolean full() {
        if(this.value == 5) {
            return true;
        }
        return false;
    }
}
