package src.ObjectOrientedPractice.Health;
import src.ObjectOrientedPractice.Health.HealthStation;
import src.ObjectOrientedPractice.Person;

public class MainProgramHealthStation {
    public static void main(String[] args) {
        HealthStation childrenHospital = new HealthStation();

        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);

        System.out.println(ethan.getName() + " weight: " + childrenHospital.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + " weight: " + childrenHospital.weigh(peter) + " kilos");

        childrenHospital.feed(ethan);
        childrenHospital.feed(ethan);
        childrenHospital.feed(ethan);

        System.out.println("");

        System.out.println(ethan.getName() + " weight: " + childrenHospital.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + " weight: " + childrenHospital.weigh(peter) + " kilos");

    }
}
