package Flight;

import java.util.ArrayList;
import java.util.Arrays;

enum FlightType {
    passengerFlight,
    cargoFlight,
    warFlight,
    undefined
}

public class Flight {
    public FlightType flightMode;

    Flight (){
        setFlightMode(FlightType.passengerFlight);
    }

    Flight setFlightMode (FlightType flightMode){
        this.flightMode = flightMode;
        return chooseFlightType();
    }

    FlightType getFlightMode(){
        return this.flightMode;
    }

    public Flight chooseFlightType (){
        switch (this.flightMode){
            case warFlight:
                WarFlight warFlight = new WarFlight();
                return warFlight;

            case cargoFlight:
                CargoFlight cargoFlight = new CargoFlight();
                return cargoFlight;

            case passengerFlight:
                PassengerFlight passengerFlight = new PassengerFlight();
                return passengerFlight;

            default:
                System.out.println("Something went wrong.");
                Flight flight = new Flight();
                flight.flightMode = FlightType.undefined;
                return flight;
        }
    }
}

class FlightTime{
    private String takeOffTime;
    private String landTime;

    void setTakeOffTime (String takeOffTime){
        this.takeOffTime = takeOffTime;
    }

    String getTakeOffTime (){
        return this.takeOffTime;
    }

    void setLandTime (String landTime){
        this.landTime = landTime;
    }

    String getLandTime (){
        return this.landTime;
    }

    @Override
    public String toString() {
        return "Flight time{" +
                "Take off time = '" + takeOffTime + '\'' +
                ", Land time = '" + landTime + '\'' +
                '}';
    }
}

class WarFlight extends Flight {
    WarPlane warPlane = new WarPlane();
    City origin = new City();
    City destination = new City();
    ArrayList<City> betweenCities = new ArrayList<City>();
    FlightTime flightTime = new FlightTime();
    ArrayList<String> pilotsName = new ArrayList<String>();

    WarFlight(){
        this.warPlane.setAirplane(AirplaneType.warPlane);
    }

    void setWarPlane (WarPlane warPlane){
        this.warPlane.setAirplane(AirplaneType.warPlane);
    }

    WarPlane getWarPlane (){
        return this.warPlane;
    }

    void setPilotsName (ArrayList<String> pilotsName){
        this.pilotsName = pilotsName;
    }

    ArrayList<String> getPilotsNames (){
        return this.pilotsName;
    }

    String getPilotName (int numberTHName){
        return this.pilotsName.get(numberTHName-1);
    }

    String printPilotsNames (){
        StringBuilder names = null;
        String namesAllPilots = null;

        for (int counter = 0 ; counter < this.pilotsName.size() ; counter++){
            names.append( counter+1 + "TH pilot name : " + this.pilotsName.get(counter) + "\n");
        }
        namesAllPilots = names.toString();

        return namesAllPilots;
    }

    void setOrigin (City origin) {
        this.origin = origin;
    }

    City getOrigin (){
        return this.origin;
    }

    void setDestination (City destination) {
        this.destination = destination;
    }

    City getDestination (){
        return this.destination;
    }

    void setBetweenCities (ArrayList<City> betweenCities) {
        this.betweenCities = betweenCities;
    }

    ArrayList<City> getBetweenCities (){
        return betweenCities;
    }

    String printBetweenCitiesNames (){
        StringBuilder names = null;
        String namesAllBetweenCities = null;

        for (int counter = 0 ; counter < this.betweenCities.size() ; counter++){
            names.append( counter+1 + "TH city name : " + this.betweenCities.get(counter) + "\n");
        }
        namesAllBetweenCities = names.toString();

        return namesAllBetweenCities;
    }

    void setFlightTime (FlightTime flightTime) {
        this.flightTime = flightTime;
    }

    FlightTime getFlightTime (){
        return flightTime;
    }

    @Override
    public String toString() {
        return "WarFlight{" +
                "Airplane = " + warPlane +
                ", Pilots name = " + pilotsName +
                ", Origin city = " + origin +
                ", Destination city = " + destination +
                ", Between cities = " + betweenCities +
                ", Flight time = " + flightTime +
                '}';
    }
}

class CargoFlight extends WarFlight {
    CargoPlane cargoPlane = new CargoPlane();

    CargoFlight(){
        this.cargoPlane.setAirplane(AirplaneType.cargoPlane);
    }

    void setCargoPlane (CargoPlane cargoPlane){
        this.cargoPlane.setAirplane(AirplaneType.cargoPlane);
    }

    CargoPlane getCargoPlane (){
        return this.cargoPlane;
    }

    double loadWeight;
    ArrayList<String> flightCrewsName = new ArrayList<String>();

    void setLoadWeight(double loadWeight){
        this.loadWeight = loadWeight;
    }

    double getLoadWeight(){
        return this.loadWeight;
    }

    void setFlightCrewsName (ArrayList<String> flightCrewsName){
        this.flightCrewsName = flightCrewsName;
    }

    ArrayList<String> getFlightCrewsNames (){
        return this.flightCrewsName;
    }

    String getFlightCrewsName (int numberTHFlightCrewsName){
        return this.flightCrewsName.get(numberTHFlightCrewsName);
    }

    String printFlightCrewsNames (){
        StringBuilder names = null;
        String namesAllFlightCrews = null;

        for (int counter = 0 ; counter < this.flightCrewsName.size() ; counter++){
            names.append( counter+1 + "TH flight crew name : " + this.flightCrewsName.get(counter) + "\n");
        }
        namesAllFlightCrews = names.toString();

        return namesAllFlightCrews;
    }

    @Override
    public String toString() {
        return "CargoFlight{" +
                "Airplane = " + cargoPlane +
                ", Pilots name = " + pilotsName +
                ", Flight crews name = " + flightCrewsName +
                ", Origin city = " + origin +
                ", Destination city = " + destination +
                ", Between cities = " + betweenCities +
                ", Flight time = " + flightTime +
                ", Load weight = " + loadWeight +
                '}';
    }
}


class Seat {
    private int seatRow;
    private char numberTHInRow;
    boolean seatFillBlank = false;
    String passengerName = null;

    void setSeatRow(int seatRow) {
        this.seatRow = seatRow;
    }

    public int getSeatRow() {
        return seatRow;
    }

    void setNumberTHInRow(char numberTHInRow) {
        this.numberTHInRow = numberTHInRow;
    }

    public char getNumberTHInRow() {
        return numberTHInRow;
    }

    void setSeatFillBlank(boolean seatFillBlank) {
        this.seatFillBlank = seatFillBlank;
    }

    boolean getSeatFillBlank() {
        return seatFillBlank;
    }

    void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerName() {
        return passengerName;
    }

    String printAllInformation () {
        if (seatFillBlank) {
            return "{ Row : " + seatRow +
                    " " + numberTHInRow +
                    ": full" +
                    "Passenger name : " + passengerName +
                    " }";
        } else{
            return "{ Row : " + seatRow +
                    " " + numberTHInRow +
                    ": Blank" +
                    "Passenger name : " + passengerName +
                    " }";
        }
    }

    @Override
    public String toString() {
        if (seatFillBlank){
            return "{ Row : " + seatRow +
                    " " + numberTHInRow +
                    ": full" +
                    " }";
        }
        else {
            return "{ Row : " + seatRow +
                    " " + numberTHInRow +
                    ": Blank" +
                    " }";
        }

    }
}

class Seats {
    Floor floor = new Floor();
    Seat temp;

    Seats (Floor floor){
        this.floor = floor;
        makeList();
    }

    Seat[][] passengersSeats = new Seat[floor.getNumberOfRows()][floor.getNumberOfSeatsInPerRow()];

    private void makeList (){
        for (int rowCounter = 0 ; rowCounter < floor.getNumberOfRows() ; rowCounter++){
            for (int colCounter = 0 ; colCounter < floor.getNumberOfSeatsInPerRow() ; colCounter++){
                passengersSeats[rowCounter][colCounter].setSeatRow(rowCounter+1);
                passengersSeats[rowCounter][colCounter].setNumberTHInRow((char)(65+colCounter));
                passengersSeats[rowCounter][colCounter].setSeatFillBlank(false);
                passengersSeats[rowCounter][colCounter].setPassengerName(null);
            }
        }
    }

    void setPassengersSeat(int row, char column, String passengerName) {
        temp = passengersSeats[row][column-65];
        if (!temp.getSeatFillBlank()) {
            throw new ArithmeticException("This seat is full.");
        }
        else {
            temp.seatFillBlank = true;
            temp.setPassengerName(passengerName);
        }
    }

    @Override
    public String toString() {
        return "Seat {" +
                "Floor = " + floor +
                ", Passengers seats = " + Arrays.toString(passengersSeats) +
                '}';
    }
}

class PassengerFlight extends CargoFlight {
    PassengerAirplane passengerAirplane = new PassengerAirplane();
    ArrayList<Seats> seats = new ArrayList<Seats>();
    Seats temp;

    PassengerFlight(){
        this.passengerAirplane.setAirplane(AirplaneType.passengerPlane);
        for (int counter = 0 ; counter < passengerAirplane.numberOfFloors ; counter++){
            temp = new Seats(passengerAirplane.floors.get(counter));
            seats.add(temp);
        }
    }

    void setPassengerAirplane (PassengerAirplane passengerAirplane){
        this.passengerAirplane.setAirplane(AirplaneType.passengerPlane);
    }

    void buyTicket (int floor , int row, char column, String passengerName) {
        seats.get(floor-1).setPassengersSeat(row,  column, passengerName);
    }

    PassengerAirplane getPassengerAirplane (){
        return this.passengerAirplane;
    }

    String passengerInformationNeedFromFlight (){
        return "PassengerFlight{" +
                "Airplane = " + passengerAirplane.passengerInformationNeedFromAirplane() +
                ", Origin city = " + origin.passengerInformationNeedFromCity() +
                ", Destination city = " + destination.passengerInformationNeedFromCity() +
                ", Flight time = " + flightTime +
                ", Seats = " + seats +
                '}';
    }

    @Override
    public String toString() {
        return "PassengerFlight{" +
                "Airplane = " + passengerAirplane +
                ", Origin city = " + origin +
                ", Destination city = " + destination +
                ", Between cities = " + betweenCities +
                ", Flight time = " + flightTime +
                ", Pilots name = " + pilotsName +
                ", Load weight = " + loadWeight +
                ", Flight crews name = " + flightCrewsName +
                ", Seats = " + seats +
                '}';
    }
}

