package Interfases_and_abstract_units.interf_and_defoult_methood;

public class Main {
    public static void main(String[] args) {
        Animals dac = new Dac("red", 5);
        System.out.println("dac.getColor() = " + dac.getColor());
        System.out.println("dac.getWaigh() = " + dac.getWeight());
        dac.aboutAnimal();
        dac.flay();
        dac.defFlay1();
        dac.defFlay2();
    }
}
