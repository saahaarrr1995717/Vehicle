package vehiles;

public class AirPort implements Parking {
    private AirPlane airPlane;
    private Helicopter helicopter;
    private Integer carParkCount=0;
    private Integer parkingCapacity=3;
    public void Park(){
        carParkCount++;
        if(carParkCount > parkingCapacity){
            System.out.println("parking capacity is full !!!!");
        }
        else {
            System.out.println("number of car is parked in airport parking : "+carParkCount);
        }
    }
}
