package src;

import java.util.Scanner;

public class Multiply {
    public static double multiplyInput(double n1, double n2, double n3) {
        return n1 * n2 * n3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter third number: ");
        double num3 = scanner.nextDouble();

        double result = multiplyInput(num1, num2, num3);
        System.out.println("The product of numbers = " + result);

        scanner.close();
    }
}
