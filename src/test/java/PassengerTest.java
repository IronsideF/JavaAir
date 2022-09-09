import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PassengerTest {
    Passenger myPassenger;

    @Before
    public void before(){
        myPassenger = new Passenger("Keith", 2);
    }
    @Test
    public void hasProperties(){
        assertEquals("Keith", myPassenger.getName());
        assertEquals(2, myPassenger.getBags());
    }
}
