
import flight.Flight;
import flight.FlightController;
import flight.ModelFlight;
import org.junit.jupiter.api.*;

import javax.swing.text.html.ListView;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

@TestMethodOrder(MethodOrderer.class)
public class FlightControllerOrder {

    private Flight f;
    private ArrayList<Flight> lf;
    private FlightController fc;

    public FlightControllerOrder() {
    }

    public void testaddFlight(){
        f = new Flight(1, 244, ModelFlight.Airbus);
        lf = new ArrayList<>();
        lf.add(f);
        fc = new FlightController(lf);
    }

    @Test
    @Order(1)
    @DisplayName("Testing order Removing")
    public void testRemoveFlight(){
        testAddFlight();
        fc.removeFlight(f);
        fc.showAll();
        assertEquals(1, fc.countFlight());
    }

    @Test
    @Order(2)
    @DisplayName("Testing order Add")
    public void testAddFlight(){
        Flight f2 = new Flight(2, 567, ModelFlight.Boeing);
        testaddFlight();
        fc.addFlight(f2);
        fc.showAll();
        assertEquals(2, fc.countFlight());
    }

}
