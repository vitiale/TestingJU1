
import flight.Flight;
import flight.FlightController;
import flight.ModelFlight;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.rmi.ServerRuntimeException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
public class FlightControllerTest {

      @Test
      @DisplayName("Testing filghtCount")
      public void testcountFlight(){
          Flight f1 = new Flight(1, 45, ModelFlight.Airbus);
          Flight f2 = new Flight(2, 45, ModelFlight.Boeing);
          Flight f3 = new Flight(3, 45, ModelFlight.McDonnell);

          ArrayList<Flight>flights = new ArrayList<>();
          flights.add(f1);
          flights.add(f2);
          flights.add(f3);

          FlightController fc = new FlightController(flights);

          assertEquals(3, fc.countFlight());
      }

      @Test
      @DisplayName("Testing flightDiv")
      @RepeatedTest(5)
      public void testdivFlight(){
          Flight f = new Flight();
          ArrayList<Flight>lf = new ArrayList<>();
          lf.add(f);
          FlightController fc = new FlightController(lf);
          assertNotEquals(1, fc.divFlight(6, 3));

      }

      @Test
      @DisplayName("Testing switchState")
      public void testswitchState(){
          Flight f = new Flight();
          ArrayList<Flight>lf = new ArrayList<>();
          lf.add(f);
          FlightController fc = new FlightController(lf);
          assertTrue(fc.switchState(true));
      }


      @Test
      @DisplayName("Testing Run Time Exception divFlight")
      public void testExceptiondivFlight(){
          Flight f = new Flight();
          ArrayList<Flight>lf = new ArrayList<>();
          lf.add(f);
          FlightController fc = new FlightController(lf);
          assertThrows(RuntimeException.class, () -> fc.divFlight(2, 0));
      }

      @Test
      @DisplayName("Testing using AssertAll")
      public void testMultiple(){
          Flight f = new Flight();
          ArrayList<Flight>lf = new ArrayList<>();
          lf.add(f);
          FlightController fc = new FlightController(lf);
          assertAll(
                  () -> assertEquals(2, fc.divFlight(6,3), "Result should be 2"),
                  () -> assertThrows(RuntimeException.class, () -> fc.divFlight(3, 0), "Should throw a RuntimeException")
          );
      }

      //Assumptions

    @Test
    @DisplayName("Assumptions switchTaste")
    public void testAssumptionsswitchTaste(){
        Flight f = new Flight();
        ArrayList<Flight>lf = new ArrayList<>();
        lf.add(f);
        FlightController fc = new FlightController(lf);
        //assertTrue(fc.switchState(true));
        //assumeTrue(fc.switchState(true));
        //assumingThat(false, () -> assertTrue(fc.switchState(false)));
        assumeTrue(fc.switchState(false));
    }


}
