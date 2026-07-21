package Unit5;

public class OverflowPractice {
    public static void main(){
        int maxInt = Integer.MAX_VALUE;         // the maximal integer, equalts to 2^31-1
        int overflow = maxInt + 1;              // causes an overflow, there is no integer after the maximal one
        System.out.println(overflow);           // prints: -2147483648, which is -2^31 - the minimal integer number
    }
}
