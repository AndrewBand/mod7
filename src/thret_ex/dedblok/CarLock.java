package thret_ex.dedblok;

public class CarLock {
    private boolean honking;
    private String name;

    public CarLock(String name) {
        this.name = name;
        this.honking = true;
    }

    public String getName() {
        return name;
    }

    public void passBridge(CarLock car) {
        while (car.honking) {
            System.out.println(car.getName() + " waiting to pass bridge");
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            //nop
        }
        System.out.println("Pass bridge");
        this.honking = false;
    }
}
