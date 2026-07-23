package src;

import java.util.Scanner;

public class InputProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = Integer.valueOf(scanner.nextLine());
        int result = number * 2;
        System.out.println("The result = " + result);

        // Assigning the user input to the variables
        System.out.println("Enter first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter second number: ");
        int second = scanner.nextInt();

        // Identifying the operation and declaring a variable for the result
        int product = first * second;

        // Printing the result of the operation
        System.out.println("The product of " + first + " and " + second + " = " + product);
    }
}
