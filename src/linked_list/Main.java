package linked_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* - не масив, тому отримати елемент  за індексом не можливо, формується за допомогою ссилок, кожен
        *елемент НОДА item має ссилку на попередній і наступний.
        * пошук за індексом відбувається шляхом перебору елементів по списку і каунтером (підрахунку елементів).
        */
        List<String> listB = new LinkedList<>();
        listB.add("AA");
        listB.add("BB");

        List<String> list = new LinkedList<>();
        list.add("aa");
        list.add("bb");

        list.addAll(listB);
        System.out.println(list);

    }
}
