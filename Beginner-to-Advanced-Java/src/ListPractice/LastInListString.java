/*
* In the exercise template there is a program that
* reads inputs from the user and adds them to a list.
* Reading is stopped once the user enters an empty string.

* Modify the program to print both the first
* and the last values after the reading ends.
* */

package src.ListPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class LastInListString {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a name:");
            String userInput = scanner.nextLine();

            if (userInput.trim().isEmpty()){
                System.out.println("First name on ths list: " + names.get(0));
                System.out.println("Last name on the list: " + names.get(names.toArray().length - 1));
                break;
            }
            names.add(userInput);
        }
        System.out.println("Names in the list:" + names);



    }
}
