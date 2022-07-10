package thret_ex.notifaii;

public class Parking {
    private int amountCar;
    private int placis;

    public Parking(int amountCar) {
        this.amountCar = amountCar;
    }

    public void joinParking() throws InterruptedException {
        synchronized (Parking.class) {
            while (amountCar == placis) {
                System.out.println("Parking full" );
                Parking.class.wait();
            }
            placis++;
            Parking.class.notifyAll();
        }
    }
    public void leaveParking() throws InterruptedException {
        synchronized (Parking.class) {
            while (placis==0) {
                Parking.class.wait();
            }
            placis--;
            System.out.println("1 plase free");
            Parking.class.notifyAll();
        }
    }
}
