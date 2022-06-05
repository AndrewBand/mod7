package hw9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(0);
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println("ll.remove(3) = " + ll.remove(4));
        System.out.println("ll.get(0) = " + ll.get(0));
        System.out.println("ll.get(3) = " + ll.get(1));
        System.out.println("ll.size() = " + ll.size());
        ll.clear();



    }
}
