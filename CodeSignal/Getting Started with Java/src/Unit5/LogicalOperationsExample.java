package Unit5;

public class LogicalOperationsExample {

        public static void main(String[] args) {
            int starsCounted = 17;
            int galaxiesCounted = 3;
            boolean darkMatterFound = false;

            // TODO: Calculate how many cosmic bodies we've found in total.
            int totalBodies = starsCounted + galaxiesCounted;
            System.out.println("Total cosmic bodies counted: " + totalBodies);

            // TODO: Use a logical AND operation to check:
            System.out.println("Found more than 15 stars and the dark matter: " + (starsCounted > 15 && darkMatterFound));
        }
    }

