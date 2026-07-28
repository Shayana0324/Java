/*
* The exercise template contains a base that reads numbers from the user
* and adds them to a list. Reading is stopped once the user
* enters the number -1.

* Expand the functionality of the program so that after reading the numbers,
* it prints all the numbers received from the user.
* The number used to indicate stopping should not be printed.
* */
package src.ListPractice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ListIntManipulation {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a number:");
            int userInput = scanner.nextInt();


            if(userInput == -1) {
                System.out.println("The numbers: " + numbers);
                break;
            }
            numbers.add(userInput);
        }

        /*
        * Expanding the program to ask for a start and end indices once it has
        * finished asking for numbers. After this the program shall
        * print all the numbers in the list that fall in the specified
        * range (between the indices given by the user, inclusive).
        * */

        int startIndex, endIndex;
        System.out.println("From where?");
        startIndex = scanner.nextInt();
        System.out.println("To what?");
        endIndex = scanner.nextInt();
        System.out.println("First index value: " + numbers.get(startIndex));
        System.out.println("Last index value: " + numbers.get(endIndex));

        /*
        * Continuing developing the program so that it finds
        * the Greatest number in the list and prints its value
        * after reading all the numbers.
         * */
        System.out.println("The greatest number: " + Collections.max(numbers));
    }
}
