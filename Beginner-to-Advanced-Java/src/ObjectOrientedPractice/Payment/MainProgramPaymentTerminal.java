package src.ObjectOrientedPractice.Payment;
import src.ObjectOrientedPractice.Payment.PaymentTerminal;
import src.ObjectOrientedPractice.Payment.PaymentCard;

public class MainProgramPaymentTerminal {
    public static void main(String[] args) {
        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);

//        double change = unicafeExactum.eatAffordably(10);
//        System.out.println("remaining change: " + change);

        PaymentCard annesCard = new PaymentCard(2);
        System.out.println("Amount of money on the card is " + annesCard.balance() + "euros");

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("There was enough money: " + wasSuccessful);

        unicafeExactum.addMoneyToCard(annesCard, 100);

        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("There was enough money: " + wasSuccessful);
        System.out.println("Amount of money on the card is " + annesCard.balance() + "euros");

//        wasSuccessful = unicafeExactum.eatAffordably(annesCard);
//        System.out.println("There was enough money: " + wasSuccessful);

//        change = unicafeExactum.eatAffordably(5);
//        System.out.println("remaining change: " + change);
//
//        change = unicafeExactum.eatHeartily(4.3);
//        System.out.println("remaining change " + change);

        System.out.println(unicafeExactum);
    }
}
