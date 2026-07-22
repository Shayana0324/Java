package Unit6;

public class SpeedConversion {
    public static void main(String[] args) {
        // Imagine converting the speed of a spaceship from kilometers per hour (double) to space-units per minute (int)
        double spaceshipSpeedInKmph = 12450.5; // Spaceship speed in kilometers per hour
        int spaceshipSpeedInSum = (int) (spaceshipSpeedInKmph / 60); // Explicitly casting to int

        System.out.println("Spaceship speed converted to space-units per minute: " + spaceshipSpeedInSum);
    }
}
