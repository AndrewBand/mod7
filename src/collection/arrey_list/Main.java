package collection.arrey_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        List<String> list = new ArrayList<>();
        // зберіга в собі список у вигляді масива

        list.add("aa");
        list.add("bb");
        list.add("gg");
        list.add("cc");

        printList(list);
//        list.forEach(elem ->> );
        System.out.println("-------------------------------");

        list.add(1,"XX");
        printList(list);
        System.out.println(list.size());
//        list.tripRoSize() - елементи в літі ніби збільшуються на 2/3, в процесі видаління застосов для зменшення до розміру фактичного.
        System.out.println("-------------------------------");
        Collections.sort(list);
        printList(list);
        System.out.println("-------------------------------");
        List<String> newList = list.subList(1,4);
        printList(newList);

    }
private static void printList(List<String> list){
    for (String elem:list) {
        System.out.println(elem);
    }
}
}
