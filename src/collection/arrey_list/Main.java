package collection.arrey_list;

import java.util.*;

public class Main {
    public static void main (String[] args) {
        List<String> list = new ArrayList<>();
        // зберіга в собі список у вигляді масива

        list.add("aa");
        list.add("bb");
        list.add("gg");
        list.add("cc");
list.set(3,"ccc");

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


        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
//        System.out.println("linkedList.pollLast() = " + linkedList.pollLast());
//        System.out.println("linkedList.poll() = " + linkedList.poll());
        System.out.println("linkedList.remove(3) = " + linkedList.remove(3));
        linkedList.clear();
//        System.out.println("linkedList.get(0) = " + linkedList.get(0));

        for (Integer l:linkedList) {
            System.out.println(l);
        }


        Map<String, Boolean> map = new HashMap<>();
        map.put("A", map.containsValue(true));
        map.put("B", map.containsValue(false));
        map.put("A", map.containsValue(true));

        System.out.println("map.keySet().size()= " + map.keySet());

        Queue<String> queue = new LinkedList<>();

    }
private static void printList(List<String> list){
    for (String elem:list) {
        System.out.println(elem);
    }
}
}
