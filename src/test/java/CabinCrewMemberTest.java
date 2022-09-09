import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember myCabinCrew;

    @Before
    public void before(){
        myCabinCrew = new CabinCrewMember("Ben", Rank.FIRST_OFFICER);
    }
    @Test
    public void hasProperties(){
        assertEquals("Ben", myCabinCrew.getName());
        assertEquals(Rank.FIRST_OFFICER, myCabinCrew.getRank());
    }
    @Test
    public void canRelayMessage(){
        assertEquals("The pilot has turned on the fasten seatbelts sign, please ensure your seatbelt is securely fastened", myCabinCrew.fastenBeltsMessage());
    }
}
