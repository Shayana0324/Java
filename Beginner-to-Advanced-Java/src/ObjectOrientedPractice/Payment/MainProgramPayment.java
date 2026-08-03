package src.ObjectOrientedPractice.Payment;
import src.ObjectOrientedPractice.Payment.PaymentCard;

public class MainProgramPayment {
    public static void main(String[] args) {
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        paulsCard.eatHeartily();
        System.out.println("Paul: " + paulsCard);

        mattsCard.earAffordable();
        System.out.println("Matt: " + mattsCard);

        paulsCard.addMoney(20);
        mattsCard.eatHeartily();

        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        paulsCard.earAffordable();
        paulsCard.earAffordable();
        mattsCard.addMoney(50);

        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
    }
}
