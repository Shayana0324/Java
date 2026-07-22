package Unit6;

public class TypeCasting {
    public static void main(String[] args) {
        int planetNumber = 7;

        // TODO: Convert the planetNumber integer to a double using casting.
        double planetNumberDouble = (double) planetNumber;
        // TODO: Now, convert the new double to a String
        String planetNumberStr = Double.toString(planetNumberDouble);
        // Printing out the String value after conversion.
        System.out.println("In our galaxy, the planet count is: " + planetNumberStr);
    }
}

