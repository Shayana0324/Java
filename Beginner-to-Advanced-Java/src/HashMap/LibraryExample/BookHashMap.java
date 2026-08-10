package src.HashMap.LibraryExample;

import java.util.ArrayList;
import java.util.HashMap;

public class BookHashMap {
    public static Book get(ArrayList<Book> books, String name) {
        for(Book book: books) {
            if(book.getName().equals(name)) {
                return book;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "...");
        ArrayList<Book> books = new ArrayList<>();

        books.add(senseAndSensibility);
        books.add(prideAndPrejudice);

        HashMap<String, Book> directory = new HashMap<>();

        directory.put(senseAndSensibility.getName(), senseAndSensibility);
        directory.put(prideAndPrejudice.getName(), prideAndPrejudice);

//        Book book = directory.get("Persuasion");
//        System.out.println();
//        System.out.println(book);
//        book = directory.get("Pride and Prejudice");
//        System.out.println(book);

        // searching for a book name Sense and Sensibility
        System.out.println(get(books, "Sense and Sensibility"));
        System.out.println();
        System.out.println(get(books, "Persuasion"));

        long start = System.nanoTime();
        System.out.println(get(books, "Sense and Sensibility"));
        System.out.println();

//        System.out.println(get(books, "Persuasion"));
        long end = System.nanoTime();
        double durationInMilliseconds = 1.0 * (end - start) / 1000000;

        System.out.println("The book search took " + durationInMilliseconds + " milliseconds.");
    }
}
