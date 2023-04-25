import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import passenger.Passenger;
import passenger.PassengerController;
import passenger.Sex;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class PassengerControllerTest {

    @Test
    @DisplayName("Total Passenger")
    public void testcountPassengers(){
        Passenger p1 = new Passenger("Jose", 78, Sex.MALE);
        Passenger p2 = new Passenger("Jose", 78, Sex.MALE);
        Passenger p3 = new Passenger("Jose", 78, Sex.MALE);
        ArrayList<Passenger>passengers = new ArrayList<>();
        passengers.add(p1);
        passengers.add(p2);
        passengers.add(p3);
        PassengerController pc = new PassengerController(passengers);

        assertEquals(3, pc.countPassengers());
    }

}
