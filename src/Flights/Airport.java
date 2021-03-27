package Flight;

public class Airport {
    String airportName;
    private int numberOfWatchTower;

    Airport(){
        airportName = "AirPort";
        numberOfWatchTower = 1;
    }

    void setAirportName (String airportName){
        this.airportName = airportName;
    }

    void setNumberOfWatchTower (int numberOfWatchTower){
        this.numberOfWatchTower = numberOfWatchTower;
    }

    String getAirportName(){
        return this.airportName;
    }

    int getNumberOfWatchTower (){
        return this.numberOfWatchTower;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "Airport name = '" + airportName + '\'' +
                ", Number of watchtower = " + numberOfWatchTower +
                '}';
    }
}