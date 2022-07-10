package thret_ex;

public class MultyThrredEX {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getContextClassLoader());
        System.out.println(Thread.currentThread().getThreadGroup());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getStackTrace());
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println("isInterrupted" + Thread.currentThread().isInterrupted());

        Thread somThred = new SomThred();
        System.out.println("somThred.getState(NEW) = " + somThred.getState());
        somThred.start();
        System.out.println("somThred.getState(1) = " + somThred.getState());
        System.out.println("somThred.currentThread().getName() = " + somThred.currentThread().getName());
        System.out.println("Thread.currentThread().getName()= " + Thread.currentThread().getName());
        System.out.println("somThred.getName() = " + somThred.getName());
        System.out.println("somThred.getState(2) = " + somThred.getState());
        System.out.println("somThred.getState(3) = " + somThred.getState());
        System.out.println("somThred.getName() = " + somThred.getName());

        Runnable runnableThred = new RunnableThred();
        Thread threadRUN = new Thread(runnableThred);
        threadRUN.getState();
        System.out.println("threadRUN.getState(1) = " + threadRUN.getState());
        System.out.println("threadRUN.getName() = " + threadRUN.getName());
        System.out.println("threadRUN.getState(2) = " + threadRUN.getState());
    }
}
