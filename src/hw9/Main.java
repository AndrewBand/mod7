package hw9;

public class Main {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(0);
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println("ll.remove(3) = " + ll.remove(3));
        System.out.println("ll.get(0) = " + ll.get(0));
        System.out.println("ll.get(3) = " + ll.get(2));
        System.out.println("ll.size() = " + ll.size());
        ll.clear();

        MyQueue mq = new MyQueue();
        mq.add(0);
        mq.add(1);
        mq.add(2);
        System.out.println("mq.remove(0) = " + mq.remove(0));
        System.out.println("mq.peek() = " + mq.peek());
        System.out.println("mq.poll() = " + mq.poll());


        MyStack st = new MyStack();
        st.push(0);
        st.push(1);
        st.push(2);
        System.out.println("st.remove(1) = " + st.remove(1));
        System.out.println("st.peek() = " + st.peek());
        System.out.println("st.pop() = " + st.pop());
        System.out.println("st.pop() = " + st.pop());


        MyHashMap hh = new MyHashMap();
        hh.put(1999, "a");
        hh.put(1999, "c");
        hh.put(2, "v");
        hh.put(4, "B");
        hh.put(5, "B");
        hh.put(6, "B");
        hh.put(7, "B");
        hh.put(8, "B");
        hh.put(9, "B");
        hh.put(10, "B");
        hh.put(11, "B");
        hh.put(12, "B");
        hh.put(13, "B");
        hh.put(14, "B");
        hh.put(15, "B");
        hh.put(16, "B");
        hh.put(17, "B");
        hh.put(18, "B");
        hh.put(19, "B");
        hh.put(20, "Bzzz");
//        hh.put(21, "B");
//        hh.put(22, "B");
//        hh.put(23, "B");
//        hh.put(24, "B");
//        hh.put(25, "Bff");
//        hh.put(3, "f");
        System.out.println("hh.remove(1) = " + hh.remove(3));
        System.out.println("hh.get(1) = " + hh.get(1));
        System.out.println("hh.get(2) = " + hh.get(20));
        System.out.println("hh.get(3) = " + hh.get(25));



    }
}
