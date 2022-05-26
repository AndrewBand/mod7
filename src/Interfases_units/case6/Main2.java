package Interfases_units.case6;

class Main2 {
    public static void main(String[] args) {

        Dac2 dac = new Dac2("Wait", 10);

        System.out.println("dac = " + dac);

        dac.defFlay();


        Flyiable2 cat = new Flyiable2() {//анонімна реалізація класа, початок
            @Override
            public void fly() {
                System.out.println("Cat flay");
            }
        };//кінець анонімна реалізація класа

        cat.fly();
    }
}
