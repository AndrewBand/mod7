package Interfases_and_abstract_units.interf_and_defoult_methood;

public class Dac extends Animals implements Flay{
//    private String color;
//    private int waigh;

    public Dac(String color, int waigh) {
        super(color, waigh);
    }
//
//    @Override
//    public String getColor() {
//        return color;
//    }
//
//    @Override
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    @Override
//    public int getWaigh() {
//        return waigh;
//    }
//
//    @Override
//    public void setWaigh(int waigh) {
////        this.waigh = waigh;
//        super(waigh);
//    }

    @Override
    public void flay() {
        System.out.println("Override defFlay dy Dac class. Color: " + getColor() + " weitht= " + getWaigh());
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
