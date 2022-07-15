package thret_ex;

public class RunnableThred implements Runnable {
    @Override
    public void run() {
        System.out.println("RunnableThred arbaiten!!!!!");
        System.out.println("Thread.RunnableThred .getState() = " + Thread.currentThread().getState());
        System.out.println("Thread.RunnableThred .getName() = " + Thread.currentThread().getName());
    }
}
