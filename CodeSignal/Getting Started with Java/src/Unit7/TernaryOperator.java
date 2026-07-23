package Unit7;

public class TernaryOperator {
    public static void main(String[] args) {
        int objectSpeed = 42;

        // Decide if an object is moving fast using a ternary operator
        String speedEvaluationMessage = objectSpeed >= 50 ? "Object is moving very fast!" : "Object is moving slowly.";

        System.out.println(speedEvaluationMessage);
    }
}
