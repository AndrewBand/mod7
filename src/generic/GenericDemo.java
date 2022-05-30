package generic;

import java.util.Set;
import java.util.TreeSet;

public class GenericDemo {
    public static void main(String[] args) {
        Set uniqueSet = new TreeSet();
        uniqueSet.add(1000L);
        uniqueSet.add("High");
        uniqueSet.add(123);
        System.out.println(uniqueSet);
        //буде помилка  ClassCastException, на 10-ій строчці, 1000L пройде а "High" ні бо не моем лонг прикастити до строчки
        //через compareTo порівнюється 1-ий і 2-ий елементи і виника помилкаю

        Set uniqueSet1 = new TreeSet();
        uniqueSet1.add(1000);
        uniqueSet1.add(123);
        System.out.println(uniqueSet1);

        Set uniqueSet2 = new TreeSet();
        uniqueSet2.add("ccc");
        uniqueSet2.add("High");
        uniqueSet2.add("123");
        System.out.println(uniqueSet2);
    }
}
