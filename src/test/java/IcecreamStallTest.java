import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IcecreamStallTest {

    public IcecreamStall icecreamStall;

    @Before
    public void setup() {
        icecreamStall = new IcecreamStall("Sundae", "Joe", 10);
    }

    @Test
    public void canGetName() {
        assertEquals("Sundae", icecreamStall.getName());
    }

    @Test
    public void canGetOwner() {
        assertEquals("Joe", icecreamStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals(10, icecreamStall.getParkingSpot());
    }


    @Test
    public void canGetRating() {
        assertEquals(0, icecreamStall.getRating());
    }

    @Test
    public void canSetRating() {
        icecreamStall.setRating(5);
        assertEquals(5, icecreamStall.getRating());
    }
}
