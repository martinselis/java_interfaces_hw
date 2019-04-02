import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class VisitorTest {


    public Visitor visitor;

    @Before
    public void setup() {
        visitor = new Visitor(10, 160, 15.5);
    }

    @Test
    public void canGetAge() {
        assertEquals (10, visitor.getAge());
    }

    @Test
    public void canGetHeight() {
        assertEquals(160, visitor.getHeight());
    }

    @Test
    public void canGetMoney() {
        assertEquals(15.5, visitor.getMoney(), 0.01);
    }


}
