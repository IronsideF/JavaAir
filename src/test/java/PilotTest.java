import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot myPilot;

    @Before
    public void before(){
        myPilot = new Pilot("Mar", Rank.CAPTAIN, "FV77008");
    }
    @Test
    public void hasProperties(){
        assertEquals("FV77008", myPilot.getLicenseNumber());
    }
    @Test
    public void canFlyPlane(){
        assertEquals("We have liftoff everyone", myPilot.flyPlane());
    }
}
