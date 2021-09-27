import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LorenaTest {

    LorenaClass testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new LorenaClass(2);
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        testObj.upgradeSpeed();
        assertEquals(3, testObj.speed);
    }

}
