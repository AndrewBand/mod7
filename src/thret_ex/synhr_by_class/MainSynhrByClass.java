package thret_ex.synhr_by_class;

import thret_ex.ex2.Counter;

public class MainSynhrByClass {
        public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread(counter);
        Thread thread2 = new Thread(counter);

        thread1.start();
        thread2.start();
    }
}
