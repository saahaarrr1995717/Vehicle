package vehiles;

public class AirPlane extends Vehiles {
    private FlightStatus flightStatus;

    public void flight() {
        System.out.println("flying!!!!");
    }

    public AirPlane(String brand, Fuel fuel, FlightStatus flightStatus) {
        super(brand, fuel);
        this.flightStatus = flightStatus;

    }
}
