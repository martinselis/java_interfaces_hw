import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RollercoasterTest {

    private Rollercoaster rollercoaster;

    @Before
    public void setup() {
        rollercoaster = new Rollercoaster("Fun Rollercoaster");
    }

    @Test
    public void canGetName() {
        assertEquals("Fun Rollercoaster", rollercoaster.getName());
    }

    @Test
    public void canGetRating() {
        assertEquals(0, rollercoaster.getRating());
    }

    @Test
    public void canSetRating() {
        rollercoaster.setRating(10);
        assertEquals(10, rollercoaster.getRating());

    }

    @Test
    public void canGetDefaultPrice() {
        assertEquals(1.0, rollercoaster.defaultPrice(), 0.01);
    }

    @Test
    public void canGetPriceForVisitor() {
        Visitor visitor = new Visitor(22, 10, 10.5);
        assertEquals(0.05, rollercoaster.priceFor(visitor));
    }
}

