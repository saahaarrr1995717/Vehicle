package vehiles;

public class Car extends Vehiles implements Parking {
    private Structure structure;
    public void Park(){
        System.out.println("car " + getBrand() +" is parked");
    }
    public Car(String brand, Fuel fuel, Structure structure) {
        super(brand, fuel);
        this.structure = structure;
    }
}
