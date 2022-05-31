package generic;
/**
 * E - element use in Java collection
 * K - key
 * V - value
 * N - number
 * T - type
 * S,U,V - new next one by one
 * ? - if wee do not know what type will be
 *
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class GenericDemo {
    public static void main(String[] args) {
//        Set uniqueSet = new TreeSet();
//        uniqueSet.add(1000L);
//        uniqueSet.add("High");
//        uniqueSet.add(123);
//        System.out.println(uniqueSet);
        //буде помилка  ClassCastException, на 10-ій строчці, 1000L пройде а "High" ні бо не моем лонг прикастити до строчки
        //через compareTo порівнюється 1-ий і 2-ий елементи і виника помилкаю

//        Set uniqueSet1 = new TreeSet();
//        uniqueSet1.add(1000);
//        uniqueSet1.add(123);
//        System.out.println(uniqueSet1);
//
//        Set uniqueSet2 = new TreeSet();
//        uniqueSet2.add("ccc");
//        uniqueSet2.add("High");
//        uniqueSet2.add("123");
//        System.out.println(uniqueSet2);
//
//        List list = new ArrayList();
//        list.add(100L);
//        list.add("high");
//        list.add(123);
//        System.out.println(list);
//
//        printElement(list);

        System.out.println("GenerikTypeOLd");
        final GenerikTypeOLd generikTypeOLd = new GenerikTypeOLd();

        generikTypeOLd.setType(123);

        System.out.println("generikTypeOLd.getType().toString() = " + generikTypeOLd.getType().toString());
        final Object generObject = generikTypeOLd.getType();
        if (generObject instanceof String) {
            final String elem = (String) generikTypeOLd.getType();
            System.out.println(elem);
        } else if (generObject instanceof Integer) {
            System.err.println("Type in not a String. Bat no problem");
            final String elem = (String) generikTypeOLd.getType().toString();
            System.out.println("elem = " + elem);
            System.out.println("elem = " + elem + 1);

            System.out.println("can do that");
            Integer elemI = (Integer) generObject;
            System.out.println("elemI = " + elemI);


        }

        System.out.println("=====GENERIC====");

        GenericTipe<Integer> genericTipe = new GenericTipe<>();

        genericTipe.setType(100);

        //do chek (if Obgect is Integer) no need, Java don't give add another type
//        genericTipe.setType("HI"); // anderline red "incompatible types"
        System.out.println("genericTipe.getType() = " + genericTipe.getType());

        GenericTipe<String> genericTipeString = new GenericTipe<>();

        genericTipeString.setType("Hello WORLD!");
        System.out.println("genericTipe.getType() = " + genericTipe.getType());


    }
    public static void printElement(List list) {
        // list  не типізований тому він Object
        for (Object elem:list) {
            System.out.println((String) elem);
        }
    }
}
