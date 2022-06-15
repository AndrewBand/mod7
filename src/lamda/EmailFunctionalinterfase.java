package lamda;
@FunctionalInterface
public interface EmailFunctionalinterfase {
    boolean checkEmail(String email);
//    вміщує лише один публічний метод
//    може містити статичці та дефолтні методи
    static void method() {
        System.out.println("static method");
    }
    default void methodDefault() {
        System.out.println(" default method");
    }

}
