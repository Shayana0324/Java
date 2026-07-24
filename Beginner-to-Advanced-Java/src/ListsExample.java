package src;

import java.util.ArrayList;
import java.util.Collections;

public class ListsExample {
    public static void main(String[] args) {
        // Creating a list
        /*
        * When a list variable is initialized,
        * the type of the values to be stored is also defined in addition to the variable type -
        * all the variables stored in a given list are of the same type
        * integer : ArrayList<Integer>
        * double: ArrayList<Double>
        * boolean: ArrayList<Boolean>
        * string: ArrayList<String>
        * */
        ArrayList<Integer> integers = new ArrayList<>();
        int intgr = 1;
        integers.add(intgr);

        ArrayList<Double> doubles = new ArrayList<>();
        double d = 4.2;
        doubles.add(d);

        // Create the word list for storing strings
        ArrayList<String> wordList = new ArrayList<>();

        // Add two values to the word list
        wordList.add("Apple");
        wordList.add("Orange");

        // Add multiple items in the list at once
        Collections.addAll(wordList,"Blueberries", "Kiwi", "Mango");

        // Retrieve the value from position 0 of the word list, and print it
        System.out.println(wordList.get(1));

        // Retrieve all items in the list
        System.out.println(wordList);

    }
}
