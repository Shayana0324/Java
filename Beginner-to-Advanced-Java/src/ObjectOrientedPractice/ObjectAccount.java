package src.ObjectOrientedPractice;
import src.ObjectOrientedPractice.Account;

public class ObjectAccount {
    public static void main(String[] args) {
        Account artosAccount = new Account("Arto's account:", 100.00);
        Account artosSwissAccount = new Account("Arto's account in Switzerland:", 1000000.00);

        System.out.println("Initial state");
        System.out.println(artosAccount);
        System.out.println(artosSwissAccount);

        artosAccount.withdraw(20);
        System.out.println("The balance of Arto's account is now:" + artosAccount.balance());
        artosSwissAccount.deposit(200);
        System.out.println("The balance of Arto's other account is now:" + artosSwissAccount.balance());

        System.out.println("End state");
        System.out.println(artosAccount);
        System.out.println(artosSwissAccount);

        /*
        * Write a program that:
        * Creates an account named "Matthews account"with the balance 1000
        * Creates an account named "My account"with the balance 0
        * Withdraws 100.0 from Matthew's account
        * Deposits 100.0 to "my account"
        * Prints both accounts
        * */
        Account matthewsAccount = new Account("Matthew's Account", 1000.00);
        Account myAccount = new Account("My Acount", 0.00);

        System.out.println("Initial State");
        System.out.println(matthewsAccount);
        System.out.println(myAccount);

        matthewsAccount.withdraw(100.0);
        myAccount.deposit(100.0);
        System.out.println("The balance in Matthew's Account: " + matthewsAccount.balance());
        System.out.println("The balance in my account: " + myAccount.balance());
    }
}
