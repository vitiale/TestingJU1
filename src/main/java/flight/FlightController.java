package flight;

import java.util.ArrayList;

public class FlightController {

    private ArrayList<Flight> listF;
    private boolean active = true;

    public FlightController(ArrayList<Flight> listF) {
        this.listF = listF;
    }

    public void addFlight(Flight flight){
        listF.add(flight);
    }

    public void removeFlight(Flight flight){
        listF.remove(flight);
    }

    public int countFlight(){
        return listF.size();
    }

    public double divFlight(int n1, int n2){
        return n1/n2;
    }

    public boolean switchState(boolean putState){
        active = putState;
        return active;
    }

    public void showAll(){
        listF
                .stream()
                .map(f -> f.getFlightNumber() + "   " + f.getModel())
                .forEach(System.out::println);
    }
}
