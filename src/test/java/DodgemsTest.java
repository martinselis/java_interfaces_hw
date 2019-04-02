import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DodgemsTest {

    private Dodgems dodgems;

    @Before
    public void setup() {
        dodgems = new Dodgems("Dodgem");
    }

    @Test
    public void canGetName() {
        assertEquals("Dodgem", dodgems.getName());
    }

    @Test
    public void canGetRating() {
        assertEquals(0, dodgems.getRating());
    }

    @Test
    public void canSetRating() {
        dodgems.setRating(10);
        assertEquals(10, dodgems.getRating());

    }
}
