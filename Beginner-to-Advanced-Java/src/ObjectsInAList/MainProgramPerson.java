package src.ObjectsInAList;
import src.ObjectsInAList.Person;
import java.util.ArrayList;

import java.util.ArrayList;

public class MainProgramPerson {
    public static void main() {
        ArrayList<Person> persons = new ArrayList<>();

        Person john = new Person("John");
        persons.add(john);

        persons.add(new Person("Matthew"));
        persons.add(new Person("Martin"));

        for (Person person: persons) {
            System.out.println(person);
        }
    }

}
