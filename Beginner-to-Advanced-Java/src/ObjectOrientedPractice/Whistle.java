package src.ObjectOrientedPractice;

public class Whistle {
    private String sound;

    public Whistle(String whisleSound) {
        this.sound = whisleSound;
    }

    public void sound() {
        System.out.println(this.sound);
    }

    public static void main() {
        Whistle duckWhistle = new Whistle("Quack");
        Whistle roosterWhistle = new Whistle("Peef");

        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();
    }
}
