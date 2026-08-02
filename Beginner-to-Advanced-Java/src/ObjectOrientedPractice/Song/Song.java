package src.ObjectOrientedPractice.Song;

public class Song {
    private String songName;
    private int songLength;

    public Song(String name, int length) {
        this.songName = name;
        this.songLength = length;
    }

    public String name() {
        return this.songName;
    }

    public int length() {
        return this.songLength;
    }
}
