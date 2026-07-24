package src;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersRead = 0;
        int sum = 0;

        while(true) {
            if (numbersRead == 5) {
                break;
            }

            System.out.println("Input number: ");
            sum = sum + Integer.valueOf(scanner.next());
            numbersRead++;
        }
        System.out.println("The sum of numbers = " + sum);
    }
}
