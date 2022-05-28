package Interfases_and_abstract_units;

public class Volvo implements Car {

    @Override
    public void drive() {
        System.out.println("Safety drive");
    }

    @Override
    public int horsePower() {
        return 200;
    }
}
