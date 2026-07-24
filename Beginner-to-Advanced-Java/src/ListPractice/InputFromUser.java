/*
* The exercise contains a base that asks the user for strings
* and adds them to a list. The program stops reading when the
* user enters an empty string. The program then prints the first
* element of the list.

* The assignment is to modify the program so that instead of the
* first value, the third value on the list is printed.
* */
package src.ListPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        while (true){
        System.out.println("Enter a name: ");
            String input = scanner.nextLine();

            if (input.trim().isEmpty()) {
                break;
            }
            names.add(input);
        }
        System.out.println("Names List:" + names);
        System.out.println("Third name on the list: " + names.get(2));

        scanner.close();
    }

}
