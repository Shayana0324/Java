package src.ObjectOrientedPractice.Song;
import src.ObjectOrientedPractice.Song.Song;

public class MainProgramSong {
    public static void main() {
        Song garden = new Song("In The Garden", 10910);
        System.out.println("The song " + garden.name() + " has a length of " + garden.length() + " seconds.");
    }

}
