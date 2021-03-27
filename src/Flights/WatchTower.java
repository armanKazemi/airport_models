package Flight;

import java.util.ArrayList;

public class WatchTower extends Server {
    private int numberOfWatchTowerEmployees;
    private ArrayList<String> namesOfWatchTowerEmployees = new ArrayList<String>();

    protected void setNumberOfWatchTowerEmployees (int numberOfWatchTowerEmployees){
        this.numberOfWatchTowerEmployees = numberOfWatchTowerEmployees;
    }
        protected int getNumberOfWatchTowerEmployees (){
        return this.numberOfWatchTowerEmployees;
    }

    protected void setNamesOfWatchTowerEmployees (ArrayList<String> namesOfWatchTowerEmployees){
        this.namesOfWatchTowerEmployees = namesOfWatchTowerEmployees;
    }
    protected ArrayList<String> getNamesOfWatchTowerEmployees (){
        return this.namesOfWatchTowerEmployees;
    }

    FlightType getFlightType (Flight flight){
        return flight.getFlightMode();
    }
}

class WatchTowerEmployees extends WatchTower {

    //Airport Access
    protected void addNewAirport (Airport airport){
        getAirportsList().add(airport);
    }
    protected void removeAirport (int numberTHRemove){
        getAirportsList().remove(numberTHRemove-1);
    }
    protected Airport getAirport (int numberTHAirport){
        return getAirportsList().get(numberTHAirport-1);
    }
    String airportInformation (int numberTHAirport){
        return getAirportsList().get(numberTHAirport-1).toString();
    }

    //City Access
    protected void addNewCity (City city){
        getCitiesList().add(city);
    }
    protected void removeCity (int numberTHRemove){
        getCitiesList().remove(numberTHRemove-1);
    }
    protected City getCity (int numberTHCity){
        return getCitiesList().get(numberTHCity-1);
    }
    String cityInformation (int numberTHCity){
        return getCitiesList().get(numberTHCity-1).toString();
    }

    //Airplane Access
    protected void addNewAirplane (AirplaneType airplaneType){
        Airplane airplane = new Airplane();
        airplane.setAirplane(airplaneType);
        getAirplanesList().add(airplane);
    }
    protected void removeAirplane (int numberTHRemove){
        getAirplanesList().remove(numberTHRemove-1);
    }
    protected Airplane getAirplane (int numberTHAirplane){
        return getAirplanesList().get(numberTHAirplane-1);
    }
    String airplaneInformation (int numberTHAirplane){
        return getAirportsList().get(numberTHAirplane-1).toString();
    }

    //Flight Access
    protected void addNewFlight (FlightType flightType){
        Flight flight = new Flight();
        flight.setFlightMode(flightType);
        getFlightsList().add(flight);
    }
    protected void removeFlight (int numberTHRemove){
        getFlightsList().remove(numberTHRemove-1);
    }
    protected Flight getFlight (int numberTHFlight){
        return getFlightsList().get(numberTHFlight-1);
    }
    String flightInformation (int numberTHFlight){
        return getFlightsList().get(numberTHFlight-1).toString();
    }
}