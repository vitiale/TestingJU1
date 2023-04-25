import flight.Flight;
import flight.ModelFlight;
import passenger.Passenger;
import passenger.Sex;
import passenger.PassengerController;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String args[]){
        System.out.println("Learning how can I testing my programs");

        Passenger p1 = new Passenger("Victor A. Liriano Luis", 32, Sex.MALE);
        Passenger p2 = new Passenger("Pedro Rodriguez", 23, Sex.MALE);
        Passenger p3 = new Passenger("Rosa Caraballo", 45, Sex.FEMALE);
        Passenger p4 = new Passenger("Maria Hdz Hdz", 19, Sex.FEMALE);
        Passenger p5 = new Passenger("Carlos Fonseca", 29, Sex.MALE);

        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(p1);
        passengers.add(p2);
        passengers.add(p3);
        passengers.add(p4);
        passengers.add(p5);

        /*passengers
                .stream()
                .map(p -> p.getFullName())
                .forEach(System.out::println);*/

        PassengerController passengerController = new PassengerController(passengers);
        passengerController.addPassenger(new Passenger("Mirtha Rdz", 25, Sex.FEMALE));

        Flight f1 = new Flight(1, 50, ModelFlight.Airbus);

        passengerController.ShowAll();
    }
}
