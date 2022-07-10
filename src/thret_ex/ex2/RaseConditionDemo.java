package thret_ex.ex2;

public class RaseConditionDemo {
        public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread(counter);
        Thread thread2 = new Thread(counter);

        thread1.start();
        thread2.start();
    }
}
