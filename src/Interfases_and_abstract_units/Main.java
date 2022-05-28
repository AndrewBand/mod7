package Interfases_and_abstract_units;

public class Main {
    public static void main(String[] args) {
        System.out.println("wrk");
        //ралізація на рівні інтерфейса:
        Car car = new Mersedes();

        car.drive();

        //ралізація на рівні абстрактного класакласа:
        Animals dog = new Dog();
        dog.animalSound();
    }
}
