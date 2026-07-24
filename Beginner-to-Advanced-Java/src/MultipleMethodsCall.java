package src;

import java.util.Scanner;

public class MultipleMethodsCall {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the Number up to which you want the multiplication table:" );
        int max = scanner.nextInt();
        multiplicationTable(max);
        scanner.close();
    }

    public static void multiplicationTable(int max) {
        int number = 1;

        while (number <= max) {
            printMultiplicationTableRow(number, max);
            number++;
        }
    }

    public static void printMultiplicationTableRow (int number, int coefficient) {
        int printable = number;
        int multiplier = 1;
        System.out.println("Multiplication table of " + number + "::");
        while(printable <= number * coefficient) {
            System.out.println(number + "*" + multiplier + " = " + printable);
            printable += number;
            multiplier++;
        }
        System.out.println("");
    }
}
