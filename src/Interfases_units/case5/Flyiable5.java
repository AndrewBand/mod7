package Interfases_units.case5;

public interface Flyiable5 extends ParentFlay5 {

    void fly();

    //якщо перед void прописаіти default , то в такий метод необхідно добавити реалізацію.

    default void defFlay(){
        System.out.println("Default flay");
    }


}
