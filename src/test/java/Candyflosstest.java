import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Candyflosstest {

    public CandyflossStall candyflossStall;

    @Before
    public void setup() {
        candyflossStall = new CandyflossStall("Sundae", "Joe", 10);
    }

    @Test
    public void canGetName() {
        assertEquals("Sundae", candyflossStall.getName());
    }

    @Test
    public void canGetOwner() {
        assertEquals("Joe", candyflossStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals(10, candyflossStall.getParkingSpot());
    }


    @Test
    public void canGetRating() {
        assertEquals(0, candyflossStall.getRating());
    }

    @Test
    public void canSetRating() {
        candyflossStall.setRating(5);
        assertEquals(5, candyflossStall.getRating());
    }
}
