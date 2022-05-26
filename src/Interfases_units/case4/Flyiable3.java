package Interfases_units.case4;

public interface Flyiable3 {

    void fly();

    //якщо перед void прописаіти default , то в такий метод необхідно добавити реалізацію.

    default void defFlay(){
        System.out.println("Default flay");
    }


}
