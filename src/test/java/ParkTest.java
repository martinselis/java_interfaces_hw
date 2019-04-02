import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ParkTest {

    private Park park;

    @Before
    public void setup() {
        park = new Park("Park");
    }

    @Test
    public void canGetName() {
        assertEquals("Park", park.getName());
    }

    @Test
    public void canGetRating() {
        assertEquals(0, park.getRating());
    }

    @Test
    public void canSetRating() {
        park.setRating(10);
        assertEquals(10, park.getRating());

    }
}
