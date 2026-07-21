package Unit5;

public class FuelLogic {
        public static void main(String[] args) {
            // Declare and initialize variables for fuel capacity (1500 gallons), consumption (120 gallons/hour), and flight duration (2 hours)
            int fuelCapacity = 1500;            // unit: gallons
            int consumption = 120;              // unit: gallons/hr
            int flightDuration = 2;             // unit: hour

            // Calculate the remaining fuel after the flight
            int remainingFuel = fuelCapacity - (consumption * flightDuration);

            // Use a logical operation to determine if the remaining fuel is more than half of the fuel capacity
            boolean hasEnoughFuel = remainingFuel > (0.5 * fuelCapacity);

            // Print out the result in a format: "Enough fuel for the next journey? true/false"
            System.out.println("Enough fuel for the next journey? " + hasEnoughFuel);
        }
    }

