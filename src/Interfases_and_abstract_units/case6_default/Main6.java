package Interfases_and_abstract_units.case6_default;

class Main6 {
    public static void main(String[] args) {

        Dac6 dac = new Dac6("Wait", 10);

        System.out.println("dac = " + dac);

        dac.defFlay();


        Flyiable6 cat = new Flyiable6() {//анонімна реалізація класа, початок
            @Override
            public void fly() {
                System.out.println("Cat flay");
            }
        };//кінець анонімна реалізація класа

        cat.fly();
    }
}
