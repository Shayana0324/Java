package Unit7;

public class ConditionalExample {
    public static void main(String[] args) {
        int starTemperature = 5000;         // Temperature in Kelvin
        String starType;

        // Determine star type based on temperature
        if (starTemperature > 3000) {
            starType = "Red Dwarf";
        } else if (starTemperature > 1000) {
            starType = "Brown Dwarf";
        } else {
            starType = "Cold, dark Star";
        }
        System.out.println("The star is categorized as: " + starType);
    }
}
