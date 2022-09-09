import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane myPlane;

    @Before
    public void before(){
        myPlane = new Plane(PlaneType.CESSNA172R);
    }
    @Test
    public void hasProperties(){
        assertEquals(PlaneType.CESSNA172R, myPlane.getPlaneType());
        assertEquals(3, myPlane.getCapacity());
        assertEquals(1.225, myPlane.getTotalWeight(), 0.0);
        assertEquals(0, myPlane.getRequiredCrew());
    }
}
