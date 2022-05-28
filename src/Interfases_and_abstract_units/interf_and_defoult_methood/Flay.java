package Interfases_and_abstract_units.interf_and_defoult_methood;

 interface Flay {
    void flay();

    default void defFlay() {
        System.out.println("Def flay");
    }

    default void defFlay1() {
        System.out.println("Def flay1");
    }

    default void defFlay2() {
        System.out.println("Def flay2");
    }
}
