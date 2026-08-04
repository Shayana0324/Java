package src.FilesAndReadingData;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

// Reading a guest list
public class GuestList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> guests = new ArrayList<>();

        try(Scanner fileScanner = new Scanner(Paths.get("src", "FilesAndReadingData", "guestlist.txt"))){
            while(fileScanner.hasNextLine()) {
                    guests.add(fileScanner.nextLine());
                }
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        System.out.println();
        System.out.println("Enter names, an empty line quits.");

        while(true) {
            String userInput = scanner.nextLine();

            if(userInput.isEmpty()) {
                System.out.println("Thank you!");
                break;
            }

            if(guests.contains(userInput)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }

        }

    }
}
