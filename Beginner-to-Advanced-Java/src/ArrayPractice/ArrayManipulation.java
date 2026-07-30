package src.ArrayPractice;

import static java.lang.Long.sum;
import java.util.Arrays;

public class ArrayManipulation {
    public static int sumOfNumbersInArray(int[] numbers) {
        return Arrays.stream(numbers).sum();
    }

    public static void main(String[] args) {
        int[] numbers = {5, 1, 3,4, 2};
        System.out.println("Sum of integers in array:" + sumOfNumbersInArray(numbers));

        String[] arrayOfStrings = {"Matti L.", "Matti P.", "Matti V."};
        double[] arrayOfFloatingpoints = {1.20, 3.14, 100.0, 0.66666667};

        for(int i = 0; i < arrayOfFloatingpoints.length; i++) {
            System.out.println(arrayOfStrings[i] + " " + arrayOfFloatingpoints[i]);
        }
    }

}
