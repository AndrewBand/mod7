package Interfases_and_abstract_units.case6_default;

public interface Flyiable2 extends ParentFlay{

    void fly();

    //якщо перед void прописаіти default , то в такий метод необхідно добавити реалізацію.

    default void defFlay(){
        System.out.println("Default flay");
    }


}
