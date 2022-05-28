package Interfases_and_abstract_units.case3;

 class Main {
    public static void main(String[] args) {

        Dac dac = new Dac("Wait",5);

        System.out.println("dac = " + dac);

        dac.fly();
        dac.defFlay();
        dac.defFlay1();
        dac.defFlay2();
    }
}
