package Interfases_units.case6;

public interface Flyiable2 extends ParentFlay{

    void fly();

    //якщо перед void прописаіти default , то в такий метод необхідно добавити реалізацію.

    default void defFlay(){
        System.out.println("Default flay");
    }


}
