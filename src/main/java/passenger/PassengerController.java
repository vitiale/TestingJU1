package passenger;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class PassengerController {

    //private SortedSet<Passenger> listP = new TreeSet<>();
    private ArrayList<Passenger> listP;// = new ArrayList<>();

    public PassengerController(ArrayList<Passenger> listP) {
        this.listP = listP;
    }

    public void addPassenger(Passenger passenger){
        listP.add(passenger);
    }

    public void deletePassenger(Passenger passenger){
        listP.remove(passenger);
    }

    public int countPassengers(){
        return listP.size();
    }

    public void ShowAll() {
        listP
                .stream()
                .map(p -> p.getFullName())
                .forEach(System.out::println);
    }
}
