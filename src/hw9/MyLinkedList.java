package hw9;

public class MyLinkedList {
    transient int size = 0;
    transient Node first;
    transient Node last;
    private static class Node {
        Object item;
        Node next;
        Node prev;

        Node(Node prev, Object element, Node next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
    void add(Object e) {
        final Node l = last;
        final Node newNode = new Node(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }
    Object get(int index) {
        Node x = first;
        for (int i = 0; i < index; i++)
            x = x.next;
        return x.item;
    }

    Object remove(int index) {
        Node x = first;
        if (index < (size)) {
            for (int i = 0; i < index; i++)
                x = x.next;
        }

        final Object element = x.item;
        final Node next = x.next;
        final Node prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }
        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }
        x.item = null;
        size--;
        return element;
    }

    void clear() {
        for (Node x = first; x != null; ) {
            Node next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        first = last = null;
        size = 0;
    }
    Integer size() {
        return size;
    }
}
