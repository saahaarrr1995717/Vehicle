package vehiles;
import java.util.Scanner;
import static vehiles.Fuel.*;

public class NewMain {
    public static void main(String[] args) {
        System.out.println("Sahar's Airport" + '\n' + "Choose the number to create vehiles" + '\n' + "1- Add Aircraft" + '\n' + "2- Add Helicopter" + '\n' + "3- Add Car"+ '\n'+"Please insert your number here : ");
        Scanner scanner = new Scanner(System.in);
        Integer input = scanner.nextInt();
        if (input.equals(1)){
            System.out.println("Enter Airplane Brand  : ");
            String brand = scanner.next();
            System.out.println("Enter Fuel Type (Petrol, Diesel, WhiteGasoline):");
            String fuelTypeString = scanner.next();
            Fuel fuel = valueOf(fuelTypeString);
            System.out.println("Enter flight status (Delayed, OnTime, TakingPassengers):");
            String flightStatusString = scanner.next();
            FlightStatus flightStatus = FlightStatus.valueOf(flightStatusString);
            AirPlane airPlane = new AirPlane(brand,fuel,flightStatus);
        }
        else if (input.equals(2)){
            System.out.println("Enter Helicopter Brand  : ");
            String brand = scanner.next();
            System.out.println("Enter Fuel Type (Petrol, Diesel, WhiteGasoline):");
            String fuelTypeString = scanner.next();
            Fuel fuel = valueOf(fuelTypeString);
            Helicopter helicopter = new Helicopter(brand,fuel);
        }
        else if (input.equals(3)){
            System.out.println("Enter Car Brand  : ");
            String brand = scanner.next();
            System.out.println("Enter Fuel Type (Petrol, Diesel, WhiteGasoline):");
            String fuelTypeString = scanner.next();
            Fuel fuel = valueOf(fuelTypeString);
            System.out.println("Enter Structure Type (Sedan, Coupe, Suv):");
            String structureType = scanner.next();
            Structure structure = Structure.valueOf(structureType);
            Car car = new Car(brand,fuel,structure);
            car.Park();
        }
    }
}