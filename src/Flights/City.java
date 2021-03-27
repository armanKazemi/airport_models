package Flight;

import java.util.ArrayList;

public class City {
    String cityName;
    int numberOfAirport;
    ArrayList<Airport> airports = new ArrayList<Airport>();

    City(){
        cityName = null;
        numberOfAirport = 1;
    }

    void setCityName (String cityName){
        this.cityName = cityName;
    }

    void setNumberOfAirport (int numberOfAirport){
        this.numberOfAirport = numberOfAirport;
    }

    String getCityName(){
        return this.cityName;
    }

    int getNumberOfAirport (){
        return this.numberOfAirport;
    }

    void setAirports (ArrayList<Airport> airports){
        this.airports = airports;
    }

    ArrayList<Airport> getAirports (){
        return this.airports;
    }

    Airport getAirport (int numberTHAirport){
        return this.airports.get(numberTHAirport-1);
    }

    String printAirportsName() {
        StringBuilder names = null;
        String namesAllAirports = null;

        for (int counter = 0 ; counter < this.airports.size() ; counter++){
            names.append( counter+1 + "TH Airport name : " + this.airports.get(counter).getAirportName() + "\n");
        }
        namesAllAirports = names.toString();

        return namesAllAirports;
    }

    String passengerInformationNeedFromCity (){
        return "City{" +
                "City Name = '" + cityName + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "City{" +
                "City Name = '" + cityName + '\'' +
                ", Number of airport = " + numberOfAirport +
                ", airports = " + airports +
                '}';
    }
}