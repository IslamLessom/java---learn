interface Electrics {
   void grow();
}

abstract class BaseCar {
    protected String model;

    BaseCar(String model) {
        this.model = model;
    }

    BaseCar(String brand, String year) {
        this.model = brand + " " + year;
    }

    final protected int wheels = 4;

    abstract void starts();

    void getInfo() {
        System.out.println("Model...");
    }

    final int getWheels() {
       return wheels;
    }
}

class Bmw extends BaseCar implements Electrics {
    Bmw(String models) {
        super(models);
    }

    void bmwStart() {
        System.out.println("обгон по правой");
    }

    @Override
    void starts() {
        System.out.println(model + "run");
    }

    @Override
    void getInfo() {
        super.getInfo();
        System.out.println("BMW - X7");
    }

    @Override
    public void grow() {
        System.out.println("Electro");
    }
}

public class testMain {
    static void main(String[] args) {
        BaseCar baseCar = new Bmw("M5 F10");

        System.out.println(baseCar.model);
        baseCar.starts();
        baseCar.getInfo();
        System.out.println(baseCar.getWheels());
    }
}
