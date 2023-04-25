package flight;

import passenger.Passenger;

import java.util.SortedSet;

public class Flight {

    private int flightNumber;
    private int fullCapacity;
    private ModelFlight modelFlight;
    //private SortedSet<Passenger> passengers;

    public Flight(){}

    public Flight(int flightNumber, int fullCapacity, ModelFlight modelFlight/*, SortedSet<Passenger> passengers*/) {
        this.flightNumber = flightNumber;
        this.fullCapacity = fullCapacity;
        this.modelFlight = modelFlight;
        //this.passengers = passengers;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getFullCapacity() {
        return fullCapacity;
    }

    public void setFullCapacity(int fullCapacity) {
        this.fullCapacity = fullCapacity;
    }

    public ModelFlight getModel() {
        return modelFlight;
    }

    public void setModel(ModelFlight modelFlight) {
        this.modelFlight = modelFlight;
    }

    /*public SortedSet<Passenger> getPassengers() {
        return passengers;
    }*/

    /*public void setPassengers(SortedSet<Passenger> passengers) {
        this.passengers = passengers;
    }*/

}
