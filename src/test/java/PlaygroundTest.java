import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlaygroundTest {

    private Playground playground;

    @Before
    public void setup() {
        playground = new Playground("play");
    }

    @Test
    public void canGetName() {
        assertEquals("play", playground.getName());
    }

    @Test
    public void canGetRating() {
        assertEquals(0, playground.getRating());
    }

    @Test
    public void canSetRating() {
        playground.setRating(10);
        assertEquals(10, playground.getRating());

    }

    @Test
    public void canCheckSecurity() {
        Visitor visitor = new Visitor(22, 10, 10.5);
        Visitor visitor2 = new Visitor(10, 10, 10.5);
        assertEquals(false, playground.isAllowed(visitor));
        assertEquals(true, playground.isAllowed(visitor2));
    }
}


