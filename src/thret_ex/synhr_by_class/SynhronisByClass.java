package thret_ex.synhr_by_class;

public class SynhronisByClass implements Runnable{
private int counter = 0;
     long startTime = System.nanoTime();
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
//            synchronized (SynhronisByClass.class) { // 4. synchronized (SynhronisByClass.class) -> аналог:
                //  1. private final static Object MONITORRE = new Object(); // static не привязывается к екземпляру класса -> MONITORR будет
                // виден всем екзамплярам классов!!!
//            synchronized (this) { //!!!!!!!!!!!!!!!! 3. synchronized (this) -> аналог:
                // 2. private final Object MONITORRE = new Object(); // MONITORR будет у каждого екзампляра класса бкдет своя!!!
                increment();
//            }
            System.out.println(Thread.currentThread().getName() + " - " + counter + "  " + (System.nanoTime()-startTime)/10000);
        }
    }
    private synchronized void increment() { // 5.     private synchronized void increment() { - синхронизация по методу

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
