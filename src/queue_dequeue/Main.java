package queue_dequeue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("BB");
        queue.add("AA");
        queue.add("XX");
        queue.add("AA");
        queue.offer("YY");
        System.out.println("Before changes " + queue);
        queue.remove();
        // вернемо елемент який хочпмо видалити:
        String rem = queue.remove();
        System.out.println("rem = " + rem);
        System.out.println("After remove " + queue);
        String pool = queue.poll();
        System.out.println("After remove poll " + pool+ " " + queue);

        String element = queue.element();
        System.out.println("element " + element + " " + queue);

        String peek = queue.peek();
        System.out.println("peek " + peek + " " + queue);
    }
}
