package vehiles;

public abstract class Vehiles {
    private String brand;
    private Fuel fuel;

    public void move() {
        System.out.println("Move On");
    }

    public void start() {
        System.out.println("Starting!!!!");
    }

    public Fuel getFuel() {
        return fuel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public Vehiles(String brand, Fuel fuel) {
        this.brand = brand;
        this.fuel = fuel;
    }
}

