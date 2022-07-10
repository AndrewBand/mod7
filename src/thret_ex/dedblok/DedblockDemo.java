package thret_ex.dedblok;

public class DedblockDemo {
    private static  final Object MON1 = new Object();
    private static  final Object MON2 = new Object();

    public static void main(String[] args) {
//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                synchronized (MON1) {
//                    System.out.println("thred1 loc MON1");
//                }
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                synchronized (MON2) {
//                    System.out.println("thred1 loc MON2");
//                }
//            }
//        }
//        );
        Thread thread1 = new Thread(() -> {
                synchronized (MON1) {
                    System.out.println("thred1 loc MON1");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (MON2) {
                        System.out.println("thred1 loc MON2");
                    }
                }


            }
        );
        Thread thread2 = new Thread(() -> {
            synchronized (MON2) {
                System.out.println("thred2 loc MON2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (MON1) {
                    System.out.println("thred2 loc MON1");
                }
            }


        }
        );
        thread1.start();
        thread2.start();


    }
}
