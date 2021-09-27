import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SiddarthTest {
    Siddarth drip;

    @Before
    public void setUp() throws Exception {
        drip = new Siddarth();
    }

    @Test(timeout = 50)
    public void testSound(){
        assertEquals("dripdarth dripgar", drip.sound());
    }

    @Test(timeout = 20)
    public void testGetPrice(){
        assertEquals(-1000000, drip.getPrice());
    }

    @Test(timeout = 50)
    public void testIsCriminal(){
        assertEquals(false, drip.isCriminal());
    }

}
