package Interfases_and_abstract_units.interf_and_defoult_methood;

public class Dac extends Animals implements Flay{
//    private String color;
//    private int waigh;


    public Dac(String colorD, int weightD) {
        super(colorD, weightD);
        System.out.println("Construktor Dac set");
    }

    void quantityWool() {
        System.out.println("Quantity of Wool = " + getWeight()*0.23);
    }

    @Override
    public void flay() {
        System.out.println("Override defFlay dy Dac class. Color: " + super.getColor() + " weitht= " + getWeight());
//        System.out.println("Override flay dy Dac class. Color: " + color + " weitht= " + waigh);
    }

    @Override
    public void defFlay1() {
        Flay.super.defFlay1();
//        System.out.println("Dac overrides defFlay");
    }

    @Override
    public void defFlay2() {
        Flay.super.defFlay2();
    }
}
