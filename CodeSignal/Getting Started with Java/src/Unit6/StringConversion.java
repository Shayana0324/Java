package Unit6;

public class StringConversion {
    public static void main(String[] args){
        int ten = 10;
        String tenString = Integer.toString(ten);
        System.out.println("The value of tenString: " + tenString);

        String twentyFiveString = "25";
        int twentyFive = Integer.parseInt(twentyFiveString);
        System.out.println("The value of twentyFive: " + twentyFive);

        String invalidNumber = "25abc";
        int number = Integer.parseInt(invalidNumber);
    }
}
