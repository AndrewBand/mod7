package thret_ex.dedblok;

public class live_lock {
    private static CarLock bmw = new CarLock("bmwX5");
    private static CarLock reno = new CarLock("renoJ3");

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> bmw.passBridge(reno));
        Thread thread2 = new Thread(() -> reno.passBridge(bmw));
        thread1.start();
        thread2.start();
    }
}
