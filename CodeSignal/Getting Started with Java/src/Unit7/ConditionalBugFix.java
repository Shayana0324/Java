package Unit7;

public class ConditionalBugFix {
    public static void main(String[] args){
        int numberOfMoons = 2;              // Number of moons observed on a new planet

        if (numberOfMoons < 1) {
            System.out.println("No moons to explore here.");
        } else if (numberOfMoons < 3) {
            System.out.println("A few moons detected!");
        } else {
            System.out.println("Wow, that's a lot of moons!");
        }
    }
}
