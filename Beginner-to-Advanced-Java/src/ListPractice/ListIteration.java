package src.ListPractice;

import java.util.ArrayList;

public class ListIteration {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();

        teachers.add("Simon");
        teachers.add("Samuel");
        teachers.add("Ann");
        teachers.add("Anna");

        int index = 0;

        // Repeat for as long as the value of the variable `index`
        // is smaller than the size of the teachers list
        while(index < teachers.size()) {
            System.out.println(teachers.get(index));
            index = index + 1;
        }
        System.out.println("\nFor Loop iteration:");
        // Converting the loop to for-loop
        for(index = 0; index < teachers.size(); index++) {
            System.out.println(teachers.get(index));
        }

        // List to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("\nIntegers: ");
        for(int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            System.out.println(number);
            // Alternatively: System.out.println(numbers.get(i));
        }

        // Reverse order print list
        index = numbers.size() - 1;
        System.out.println("\nList in reverse order:");
        while(index >= 0){
            int number = numbers.get(index);
            System.out.println(number);
            index = index - 1;
        }
    }
}
