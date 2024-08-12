package vehiles;

public class Main {
    public static void main(String[] args) {
        AirPort airPort = new AirPort();
        AirPlane airPlane1 = new AirPlane("Bowing", Fuel.WhiteGasoline, FlightStatus.OnTime);
        AirPlane airPlane2 = new AirPlane("AirBus", Fuel.WhiteGasoline, FlightStatus.Delayed);
        AirPlane airPlane3 = new AirPlane("Bowing", Fuel.WhiteGasoline, FlightStatus.OnTime);
        AirPlane airPlane4 = new AirPlane("Bowing", Fuel.WhiteGasoline, FlightStatus.Delayed);
        AirPlane airPlane5 = new AirPlane("Bowing", Fuel.WhiteGasoline, FlightStatus.TakingPassengers);
        AirPlane airPlane6 = new AirPlane("AirBus", Fuel.WhiteGasoline, FlightStatus.OnTime);
        Helicopter helicopter1 = new Helicopter("Bowing", Fuel.Diesel);
        Helicopter helicopter2 = new Helicopter("AirBus", Fuel.Diesel);
        Helicopter helicopter3 = new Helicopter("AirBus", Fuel.Diesel);
        Car car1 = new Car("BMW", Fuel.Petrol, Structure.Coupe);
        Car car2 = new Car("Benz", Fuel.Petrol, Structure.Sedan);
        Car car3 = new Car("Toyota", Fuel.Petrol, Structure.Suv);
        Car car4 = new Car("Toyota", Fuel.Petrol, Structure.Sedan);
        Car car5 = new Car("Honda", Fuel.Petrol, Structure.Sedan);
        Car car6 = new Car("BMW", Fuel.Petrol, Structure.Sedan);
        Car car7 = new Car("Benz", Fuel.Petrol, Structure.Suv);
        Car car8 = new Car("Hyundai", Fuel.Petrol, Structure.Sedan);
        Car car9 = new Car("Peugeot", Fuel.Petrol, Structure.Sedan);
        Car car10 = new Car("Hyundai", Fuel.Petrol, Structure.Suv);
        car1.Park();
        airPort.Park();
        airPort.Park();
        airPort.Park();
        airPort.Park();
        airPort.Park();
        helicopter1.verticalFlight();
        helicopter1.flight();
        airPlane1.flight();

    }
}
