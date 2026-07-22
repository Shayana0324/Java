package Unit6;

public class TypeConversion {
    public static void main(String[] args) {
        double starDistance = 142.5; // Distance in light years as a double
        int roundedDistance = (int) starDistance; // There's an error related to types here

        String message = "The star is " + roundedDistance + " light years away.";
        System.out.println(message); // Is the printed message right?
    }

}
