package Interfases_and_abstract_units.case5_default;

public interface Flyiable5 extends ParentFlay5 {

    void fly();

    //якщо перед void прописаіти default , то в такий метод необхідно добавити реалізацію.

    default void defFlay(){
        System.out.println("Default flay");
    }


}
