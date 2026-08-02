package src.ObjectOrientedPractice;

public class Person {
    private String name;
    private int age;

    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }

    // Defining methods for an object
    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    // Changing an Instance Variable's value in a method
    // growOlder() method added
    public void growOlder() {
        if (this.age < 30) {
            this.age = this.age + 1;
        }
    }

    public int returnAge() {
        return this.age;
    }

    public static void main(String[] args) {
        Person ada = new Person("Ada");
        Person antti = new Person("Antti");
        Person martin = new Person("Martin");

        ada.printPerson();
        antti.printPerson();
        martin.printPerson();
        System.out.println("");

        ada.growOlder();
        ada.growOlder();
        antti.growOlder();

        System.out.println("Ada's age: " + ada.returnAge());
        System.out.println("Antti's age: " + antti.returnAge());
        int combined = ada.returnAge() + antti.returnAge();
        System.out.println("Ada and Antti's combined age " + combined + " years");
    }
}
