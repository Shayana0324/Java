package src.ObjectsInAList;
import src.ObjectsInAList.Person;
import java.util.ArrayList;
import java.util.Scanner;

public class MainProgramPerson {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();

        // Read the names of persons from the user
        while(true) {
            System.out.println("Enter a name, empty will stop: ");
            String name = scanner.nextLine();
            if(name.isEmpty()) {
                break;
            }

            // Add to the list a new person whose name is the previous user input
            persons.add(new Person(name));
        }

        System.out.println();
        System.out.println("Persons in total: " + persons.size());
        System.out.println("Persons: " );

        for (Person person: persons) {
            System.out.println(person);
        }
    }

}
