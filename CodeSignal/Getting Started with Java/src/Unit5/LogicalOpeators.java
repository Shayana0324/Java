package Unit5;

public class LogicalOpeators {
    public static void main() {
        System.out.println(true && true);       // true
        System.out.println(true && false);      // false
        System.out.println(false && true);      // false
        System.out.println(false && false);     // false

        System.out.println((true || true));     // true
        System.out.println(true || false);      // true
        System.out.println(false || true);      // true
        System.out.println(false || false);     // false

        System.out.println(!true);              // false
        System.out.println(!false);             // true
    }
}
