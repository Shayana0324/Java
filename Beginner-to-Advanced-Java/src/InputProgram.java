package src;

import java.util.Scanner;

public class InputProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = Integer.valueOf(scanner.nextLine());
        int result = number * 2;
        System.out.println("The result = " + result);
    }
}
