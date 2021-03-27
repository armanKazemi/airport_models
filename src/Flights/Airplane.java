package Flight;

import java.util.ArrayList;

enum AirplaneType {
    passengerPlane,
    cargoPlane,
    warPlane,
    undefined
}

public class Airplane {
    public AirplaneType mode;

    Airplane (){
        setAirplane(AirplaneType.passengerPlane);
    }

    Airplane setAirplane (AirplaneType mode){
        this.mode = mode;
        return chooseAirplaneType();
    }

    void setMode (AirplaneType mode){
        this.mode = mode;
    }

    AirplaneType getMode(){
        return this.mode;
    }

    public Airplane chooseAirplaneType (){
        switch (this.mode){
            case warPlane:
                WarPlane warPlane = new WarPlane();
                return warPlane;

            case cargoPlane:
                CargoPlane cargoPlane = new CargoPlane();
                return cargoPlane;

            case passengerPlane:
                PassengerAirplane passengerAirplane = new PassengerAirplane();
                return passengerAirplane;

            default:
                System.out.println("Something went wrong.");
                Airplane airplane = new Airplane();
                airplane.mode = AirplaneType.undefined;
                return airplane;
        }
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "Airplane type = " + mode +
                '}';
    }
}


class WarPlane extends Airplane {
    String airplaneName;
    int numberOfPilot;

    WarPlane(){
        airplaneName = "AirCraft";
        numberOfPilot = 1;
    }

    void setAirplaneName (String airplaneName){
        this.airplaneName = airplaneName;
    }

    String getAirplaneName (){
        return this.airplaneName;
    }

    void setNumberOfPilot (int numberOfPilot){
        this.numberOfPilot = numberOfPilot;
    }

    int getNumberOfPilot (){
        return this.numberOfPilot;
    }

    @Override
    public String toString() {
        return  "WarPlane{" +
                "Airplane name = '" + airplaneName + '\'' +
                ", Number of pilot = " + numberOfPilot +
                '}';
    }
}


class CargoPlane extends WarPlane {
    int numberOfFlightCrew;
    double capacityLoadWeight;

    CargoPlane(){
        numberOfFlightCrew = 0;
        capacityLoadWeight = 100;
    }

    void setCapacityLoadWeight(double capacityLoadWeight){
        this.capacityLoadWeight = capacityLoadWeight;
    }

    double getCapacityLoadWeight(){
        return this.capacityLoadWeight;
    }

    void setNumberOfFlightCrew (int numberOfFlightCrew){
        this.numberOfFlightCrew = numberOfPilot;
    }

    int getNumberOfFlightCrew (){
        return this.numberOfFlightCrew;
    }

    @Override
    public String toString() {
        return "CargoPlane{" +
                "Airplane name = '" + airplaneName + '\'' +
                ", Load weight = " + capacityLoadWeight +
                ", Number of pilot = " + numberOfPilot +
                ", Number of flight crew = " + numberOfFlightCrew +
                '}';
    }
}

class Floor {
    private int numberOfRows;
    private int numberOfSeatsInPerRow;

    Floor(){
        numberOfRows = 1;
        numberOfSeatsInPerRow = 1;
    }

    void setNumberOfRows (int numberOfRows){
        this.numberOfRows = numberOfRows;
    }

    int getNumberOfRows (){
        return this.numberOfRows;
    }

    void setNumberOfSeatsInPerRow (int numberOfSeatsInPerRow){
        this.numberOfSeatsInPerRow = numberOfSeatsInPerRow;
    }

    int getNumberOfSeatsInPerRow (){
        return this.numberOfSeatsInPerRow;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "Number of rows = " + numberOfRows +
                ", Number of seats in per row = " + numberOfSeatsInPerRow +
                '}';
    }
}

enum AirplaneLevel{
    perfect,
    normal,
    weak
}

class PassengerAirplane extends CargoPlane {
    int numberOfFloors;
    int numberOfPlaneSeats;
    ArrayList<Floor> floors = new ArrayList<Floor>();
    public AirplaneLevel modes;

    PassengerAirplane(){
        numberOfFloors = 1;
        numberOfPlaneSeats = 1;
        this.modes = AirplaneLevel.normal;
    }

    void setModes(AirplaneLevel modes){
        this.modes = modes;
    }

    AirplaneLevel getModes(){
        return this.modes;
    }

    void setNumberOfPlaneSeats (int numberOfPlaneSeats){
        this.numberOfPlaneSeats = numberOfPlaneSeats;
    }

    int getNumberOfPlaneSeats (){
        return this.numberOfPlaneSeats;
    }

    void setNumberOfFloors (int numberOfFloors){
        this.numberOfFloors = numberOfFloors;
    }

    int getNumberOfFloors (){
        return this.numberOfFloors;
    }

    void setFloors (ArrayList<Floor> floors){
        this.floors = floors;
    }

    ArrayList<Floor> getFloors (){
        return this.floors;
    }

    Floor getFloor (int numberTHFloor){
        return this.floors.get(numberTHFloor-1);
    }

    String passengerInformationNeedFromAirplane (){
        return "PassengerAirplane{" +
                "Airplane name = '" + airplaneName + '\'' +
                ", Number of plane seats = " + numberOfPlaneSeats +
                ", Number of floors = " + numberOfFloors +
                ", Floors = " + floors +
                '}';
    }

    @Override
    public String toString() {
        return "PassengerAirplane{" +
                "Airplane name = '" + airplaneName + '\'' +
                ", Number of plane seats = " + numberOfPlaneSeats +
                ", Number of floors = " + numberOfFloors +
                ", Floors = " + floors +
                ", Load weight = " + capacityLoadWeight +
                ", Number of pilot = " + numberOfPilot +
                ", Number of flight crew = " + numberOfFlightCrew +
                '}';
    }
}
