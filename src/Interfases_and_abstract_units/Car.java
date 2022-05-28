package Interfases_and_abstract_units;

public interface Car {
    static final int NUMBER_OF_WHEELS = 4;

    public void drive();

    public int horsePower();

    default int getNumberOfWheels(){
        return NUMBER_OF_WHEELS;
    }
}
