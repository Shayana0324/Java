package src.ListPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class LastInListInt {
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
