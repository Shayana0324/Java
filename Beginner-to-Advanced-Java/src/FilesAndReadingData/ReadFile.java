package src.FilesAndReadingData;
import java.util.Scanner;
import java.nio.file.Paths;

public class ReadFile {
    public static void main(String[] args) {
        // Paths.get("file.txt") will work only if the working directory is Beginner-to-Advanced-Java
//        try (Scanner scanner = new Scanner(Paths.get("file.txt"))) {
          try (Scanner scanner = new Scanner(Paths.get("src","FilesAndReadingData", "file.txt"))) {
            // Read the file until all lines have been read
            while(scanner.hasNextLine()) {
                // we read one line
                String row = scanner.nextLine();
                // print the line that we read
                System.out.println(row);
            }
        } catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
