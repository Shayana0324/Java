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
    }
}
