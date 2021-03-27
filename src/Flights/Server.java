package Flight;

import java.util.ArrayList;

public class Server {
    private ArrayList<Airport> airportsList = new ArrayList<Airport>();
    private ArrayList<City> citiesList = new ArrayList<City>();
    private ArrayList<Airplane> airplanesList = new ArrayList<Airplane>();
    private ArrayList<Flight> flightsList = new ArrayList<Flight>();
    private ArrayList<WatchTower> watchTowersList = new ArrayList<WatchTower>();

    ArrayList<Airport> getAirportsList(){
        return airportsList;
    }

    ArrayList<City> getCitiesList() {
        return citiesList;
    }

    ArrayList<Airplane> getAirplanesList() {
        return airplanesList;
    }

    ArrayList<Flight> getFlightsList() {
        return flightsList;
    }

    ArrayList<WatchTower> getWatchTowersList() {
        return watchTowersList;
    }


    String airportsInformation(){
        StringBuilder airportsInformation = null;
        for (Flight flight : flightsList){
            airportsInformation.append(flight.toString());
        }
        return airportsInformation.toString();
    }

    String citiesInformation(){
        StringBuilder citiesInformation = null;
        for (City city : citiesList){
            citiesInformation.append(city.toString());
        }
        return citiesInformation.toString();
    }

    String airplanesInformation(){
        StringBuilder airplanesInformation = null;
        for (Airplane airplane : airplanesList){
            airplanesInformation.append(airplane.toString());
        }
        return airplanesInformation.toString();
    }

    String watchtowersInformation(){
        StringBuilder watchtowersInformation = null;
        for (WatchTower watchTower : watchTowersList){
            watchtowersInformation.append(watchTower.toString());
        }
        return watchtowersInformation.toString();
    }

    String flightsInformation(){
        StringBuilder flightsInformation = null;
        for (Flight flight : flightsList){
            flightsInformation.append(flight.toString());
        }
        return flightsInformation.toString();
    }


    public void setAirportsList(ArrayList<Airport> airportsList) {
        this.airportsList = airportsList;
    }

    void setCitiesList(ArrayList<City> citiesList) {
        this.citiesList = citiesList;
    }

    void setAirplanesList(ArrayList<Airplane> airplanesList) {
        this.airplanesList = airplanesList;
    }

    void setWatchTowersList(ArrayList<WatchTower> watchTowersList) {
        this.watchTowersList = watchTowersList;
    }

    public void setFlightsList(ArrayList<Flight> flightsList) {
        this.flightsList = flightsList;
    }
}

class Passengers extends Server {

    protected ArrayList<Flight> flightListForPassenger = new ArrayList<Flight>();
    private void separateFlights () {
        for (Flight flight : getFlightsList()) {
            if (flight.getFlightMode() == FlightType.passengerFlight) {
                flightListForPassenger.add(flight);
            }
        }
    }

    private StringBuilder flightListInformationForPassengers;

    String getFlightsListForPassenger() {
        for (Flight flight : flightListForPassenger){
            //???
//            flightListInformationForPassengers.append(flight.passengerInformationNeedFromFlight)
        }
        return flightListInformationForPassengers.toString();
    }

    void buyTicket (int numberTHFlight , int floor , int row, char column, String passengerName) {
//        ???
//        flightListForPassenger.get(numberTHFlight-1).buyTicket (floor, row, column, passengerName);
    }
}

class FlightStaff extends Server{
    String flightInformation (int numberTHFlight){
        return getFlightsList().get(numberTHFlight-1).toString();
    }
}