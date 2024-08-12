package vehiles;

public class Helicopter extends Vehiles {
    public void flight() {
        System.out.println("flying helicopter!!!!");
    }
    public void verticalFlight() {
        System.out.println("vertical flying!!!!");
    }
    public Helicopter(String brand,Fuel fuel){
        super(brand, fuel);

    }
}
