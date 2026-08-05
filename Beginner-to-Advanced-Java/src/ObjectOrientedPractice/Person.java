package src.ObjectOrientedPractice;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String initialName) {
        this(initialName, 0, 0, 0);
    }

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
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

    public boolean isOfLegalAge() {
        if (this.age < 18) {
            return false;
        }
        return true;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    @Override
    public String toString() {
        return this.name + ", age " + this.age + " years";
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

        if (antti.isOfLegalAge()) {
            System.out.println(antti.getName() + " is of legal age");
        } else {
            System.out.println(antti.getName() + " is underage");
        }
    }
}
