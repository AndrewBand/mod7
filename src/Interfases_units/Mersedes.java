package Interfases_units;

public class Mersedes implements Car{
    @Override
    public void drive() {
        System.out.println("Comfort drive");
    }

    @Override
    public int horsePower() {
        return 250;
    }
}
