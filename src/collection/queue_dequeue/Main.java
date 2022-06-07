package collection.queue_dequeue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<String> dequeue = new LinkedList<>();
        // добавляє сортування на основі пріорітета
        dequeue.add("BB");
        dequeue.add("AA");
        dequeue.add("XX");
        dequeue.add("AA");
        dequeue.offer("YY");

        dequeue.addFirst("ZIKA");
        dequeue.addLast("BUKA");

        System.out.println(dequeue);
        Iterator x = dequeue.descendingIterator();

        while (x.hasNext()) {
                System.out.print(" " + x.next());
            }
        System.out.println("\n -------Queue------------------");
Queue<String> qq = new LinkedList<>();
        qq.add("AA");
        qq.add("Ab");
        qq.add("Ac");
        qq.add("Ad");
        System.out.println("qq = " + qq);
        qq.remove("AA");
        System.out.println("qq = " + qq);
//qq.clear();
        System.out.println("qq = " + qq);
        System.out.println("qq.peek() = " + qq.peek());
        System.out.println("qq = " + qq);
        System.out.println("qq.poll() = " + qq.poll());
        System.out.println("qq = " + qq);


    }
}
