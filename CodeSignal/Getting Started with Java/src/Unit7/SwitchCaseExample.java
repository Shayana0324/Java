package Unit7;

public class SwitchCaseExample {
    public static void main(String[] args) {
        int starBrightness = 2;             // Brightness of the observed star on a scale from 1 to 10

        // Using switch statement
        switch(starBrightness) {
            case 1:
                System.out.println("Star is too dim, use a brigher telescope.");
                break;
            case 2:
                System.out.println("Star could be more visible, try to adjust the lens.");
                break;
            case 3:
                System.out.println("Star is fairly bright, let's start the analysis.");
                break;
            default:
                System.out.println("This star is so bright, it's visible to the naked eye!");
        }
    }
}
