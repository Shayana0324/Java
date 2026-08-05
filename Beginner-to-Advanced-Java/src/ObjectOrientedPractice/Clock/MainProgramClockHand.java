package src.ObjectOrientedPractice.Clock;

public class MainProgramClockHand {
    public static void main(String[] args) {
        ClockHand hours = new ClockHand(24);
        ClockHand minutes = new ClockHand(60);
        ClockHand seconds = new ClockHand(60);

        while(hours.value() < 24) {
            // Printing the time
            System.out.println(hours + ":" + minutes + ":" + seconds);

            // Advancing the second hand
            seconds.advance();

            // Advancing the other hands when required
            if(seconds.value() == 0) {
                minutes.advance();

                if(minutes.value() == 0) {
                    hours.advance();
                }
            }
        }
    }
}
