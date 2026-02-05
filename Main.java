interface Electric {
    void charge();
}

abstract class Car {
    protected String model;

    Car(String model) {
        this.model = model;
    }

    protected final int wheels = 4;

    abstract void start();

    void getInfo() {
        System.out.println("Car model - " + model);
    }

    final void getWheels() {
        System.out.println("Car wheels - " + wheels);
    }
}

class Mercedes extends Car implements Electric {

    Mercedes(String model) {
       super(model);
    }

    @Override
    void start() {
        System.out.println("Mercedes started");
    }

    @Override
    void getInfo() {
        super.getInfo();
        System.out.println("Brand: Mercedes");
    }

    @Override
    public void charge() {
        System.out.println("Mercedes charge....");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Mercedes("S-class");

        car.start();
        car.getWheels();
        car.getInfo();

        // instanceof
        if (car instanceof Mercedes) {
            System.out.println("This is Mercedes");
        }

        if (car instanceof Electric) {
            Electric electricCar = (Electric) car;
            electricCar.charge();
        }
    }
}
