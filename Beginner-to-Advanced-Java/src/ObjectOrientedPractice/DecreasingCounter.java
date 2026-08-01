/*
* Part 1:
* Implement the decrement() method in the class body in such
* a way that it decrements the 'value' variable of the object
* it's being called on by one. Once done with the decrement() method,
* the main program of the previous example should work to produce
* the output.
*
* Part 2:
* Implement the decrement() in such a way that the counter's value
* never becomes negative. This means that if the value of the counter
* is 0, it cannot be decremented. A Conditional statement is useful here.
*
* Part 3:
* Create the method public void reset()for the counter that resets
* the value of the counter to 0.
 * */

package src.ObjectOrientedPractice;

public class DecreasingCounter {
    private int value;

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        if (this.value > 0){
            this.value = this.value - 1;
        }
    }

    public void reset() {
        this.value = 0;
    }
}


