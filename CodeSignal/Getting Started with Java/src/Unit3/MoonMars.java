package Unit3;

public class MoonMars {
        public static void main(String[] args) {
            // Assign the distance to the Moon (384400 kilometers) to a variable
            double distanceToMoon = 384400;        // km

            // Assign the distance to Mars (225000000 kilometers) to another variable
            double distanceToMars = 225000000;     // km

            // Compare the distance to the Moon to see if it's less than 1 million kilometers
            boolean distanceCmpMoon = distanceToMoon < 1000000;

            // Check if the distance to Mars is greater than the distance to the Moon
            boolean distanceCmpMars = distanceToMars > distanceToMoon;

            // Print results of these two comparisons to the console
            System.out.println("Distance to Moon is less than 1 million kilometers: " + distanceCmpMoon);
            System.out.println("Distance to Mars is greater than the distance to the Moon: " + distanceCmpMars );
        }
    }

