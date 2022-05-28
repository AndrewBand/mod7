package Interfases_and_abstract_units.interf_and_defoult_methood;

public class Main {
    public static void main(String[] args) {
        Animals dac = new Dac("red", 5);
        System.out.println("dac.getColor() = " + dac.getColor());
        System.out.println("dac.getWaigh() = " + dac.getWaigh());
        dac.aboutAnimal();
        ((Dac) dac).flay();
        ((Dac) dac).defFlay1();
        ((Dac) dac).defFlay2();
    }
}
