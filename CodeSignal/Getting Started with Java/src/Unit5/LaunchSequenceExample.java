package Unit5;

public class LaunchSequenceExample {
        public static void main(String[] args) {
            // Constants representing the level of fuel in the spaceship and the required minimum before launch.
            int currentFuel = 300;
            int requiredFuel = 300;
            boolean engineCheckComplete = true;

            // Check if there is adequate fuel and if the pre-launch engine check is complete.
            System.out.println(currentFuel >= requiredFuel && engineCheckComplete);
        }
    }

