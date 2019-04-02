import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    public TobaccoStall tobaccoStall;

    @Before
    public void setup() {
        tobaccoStall = new TobaccoStall("Sundae", "Joe", 10);
    }

    @Test
    public void canGetName() {
        assertEquals("Sundae", tobaccoStall.getName());
    }

    @Test
    public void canGetOwner() {
        assertEquals("Joe", tobaccoStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals(10, tobaccoStall.getParkingSpot());
    }


    @Test
    public void canGetRating() {
        assertEquals(0, tobaccoStall.getRating());
    }

    @Test
    public void canSetRating() {
        tobaccoStall.setRating(5);
        assertEquals(5, tobaccoStall.getRating());
    }

    @Test
    public void canCheckSecurity() {
        Visitor visitor = new Visitor(22, 10, 10.5);
        Visitor visitor2 = new Visitor(10, 10, 10.5);
        assertEquals(true, tobaccoStall.isAllowed(visitor));
        assertEquals(false, tobaccoStall.isAllowed(visitor2));
    }
}
