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
    }

}
