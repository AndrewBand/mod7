package hw11;

import java.util.List;

import static java.util.Arrays.asList;

public class Test11 {
    public static void main(String[] args) {
        List<String> testList = asList("Ivan", "Peter", "Inna", "Kat", "Sem" );
        List<String> testList2 = asList("IVAN", "PETER", "INNA" );
        Modul11 m11 = new Modul11();
//    Задание 1#
        System.out.println("m11.tasck1(testList) = " + m11.tasck1(testList));
//    Задание 2#
        System.out.println("m11.tasck2(testList) = " + m11.tasck2(testList));
        //    Задание 3#
        String[] testList3 = {"1, 2, 0", "4, 5"};
        System.out.println("m11.tasck3(testList3) = " + m11.tasck3(testList3));
//    Задание 4#
//        m11.infinityDijitCycle(25214903917L, 11L,  2^48L, 10L).forEach(System.out::println);
//    Задание 5#
        m11.zip(testList.stream(), testList2.stream())
                .forEach(System.out::println);
    }
}
