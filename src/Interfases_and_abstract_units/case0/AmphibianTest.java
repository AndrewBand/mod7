package Interfases_and_abstract_units.case0;

interface Flyable {
    void fly();
}

interface Swimable {
    void swim();
}

interface UniversalTransport extends Flyable, Swimable {
    String getName();
}

class Amphibian implements UniversalTransport {
    public void fly() {
        System.out.println(getName() + " fly");
    }

    public void swim() {
        System.out.println(getName() + " swim");
    }

    public String getName() {
        return "Amphibian";
    }
}

class AmphibianTest {
    public static void main(String[] args) {
        Amphibian a = new Amphibian();
        a.fly();  //Amphibian fly
        a.swim(); //Amphibian swim
        System.out.println("a.getName() = " + a.getName());
    }
}
