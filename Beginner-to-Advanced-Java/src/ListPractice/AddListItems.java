/*
* Here is a program that reads integers from the user
* and adds them to a list. This ends when the user
* enters 0. The program then prints the first value
* on the list.

* Modifying the program so that instead of the
* first value, the program prints the sum of
* the second and third numbers.
* */
package src.ListPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class AddListItems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();

        while (true) {
            System.out.println("Enter an integer: ");
            int userInput = scanner.nextInt();

            if(userInput == 0) {
                break;
            }

            nums.add(userInput);

        }
        System.out.println("List of numbers: " + nums);
        System.out.println("First value = " + nums.getFirst());
        int sum = nums.get(1) + nums.get(2);
        System.out.println("Sum of second and third numbers = " + sum);

        // Adding all numbers that are in the list
        int sumOfList = 0;
        for(int num : nums) {
            sumOfList += num;
        }
        System.out.println("Sum of all numbers in the list = " + sumOfList);
    }
}
