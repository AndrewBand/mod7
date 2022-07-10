package thret_ex.demons;

public class DemonDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " generate " + i);
                try {
                    Thread.sleep(19);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " generate " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " finish work");
    }
}
