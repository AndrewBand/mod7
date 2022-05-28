package Interfases_and_abstract_units.case3;

 interface Flyiable {
    static final int DEFAULT_WAIGHT = 5;
    void fly();

    //якщо перед void прописаіти default , то в такий метод необхідно добавити реалізацію.

    default void defFlay(){
        System.out.println("Default flay");
    }

    default void defFlay1(){
        System.out.println("Default flay1");
    }

    default void defFlay2(){
        System.out.println("Default flay2 " + DEFAULT_WAIGHT);
    }
}
