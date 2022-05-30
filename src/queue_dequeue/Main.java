package queue_dequeue;

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

    }
}
