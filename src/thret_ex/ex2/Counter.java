package thret_ex.ex2;

public class Counter implements Runnable{
private int counter = 0;
private final static Object MONITORRE = new Object(); // static не привязывается к екземпляру класса -> MONITORR будет
    // виден всем екзамплярам классов!!!
//private final Object MONITORRE = new Object(); // MONITORR будет у каждого екзампляра класса бкдет своя!!!
     long startTime = System.nanoTime();
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (MONITORRE) {
                increment();
            }
            System.out.println(Thread.currentThread().getName() + " - " + counter + "  " + (System.nanoTime()-startTime)/10000);
        }
    }
    private void increment() {
        System.out.println(" tc " + Thread.currentThread().getName() + " - " + counter + "  " +  ((System.nanoTime()-startTime)/10000));
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            //NOP
        }
        counter++;
        System.out.println(" afc " + Thread.currentThread().getName() + " - " + counter + "  " +  ((System.nanoTime()-startTime)/10000));
    }
}
