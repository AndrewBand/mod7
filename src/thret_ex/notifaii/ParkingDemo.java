package thret_ex.notifaii;

public class ParkingDemo {
    Parking parking = new Parking(5);
    public static void main(String[] args) {
        ParkingDemo parkingDemo = new ParkingDemo();
        for (int i = 0; i < 10; i++) {
            Thread car = new Thread(() -> {
                try {
                    parkingDemo.parkingDo();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            car.start();
        }
    }
    public void parkingDo() throws InterruptedException {
        parking.joinParking();
        System.out.println("car " + Thread.currentThread().getName() + " block parking place");
        Thread.sleep(3000);
        parking.leaveParking();
        System.out.println("car " + Thread.currentThread().getName() + " leave parking place");
    }
}
