package thret_ex;

public class SomThred extends Thread {
    @Override
    public void run() {
        System.out.println("Som THred work...");
        System.out.println("Som THred State(RUNN) = " + Thread.currentThread().getState());
        System.out.println("Som THred Name() = " + Thread.currentThread().getName());
    }
}
