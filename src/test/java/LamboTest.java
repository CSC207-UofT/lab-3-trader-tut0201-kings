/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LamboTest {
    Lambo h;

    @Before
    public void setUp() throws Exception {
        h = new Lambo();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("200.0 on tha dash!!!!!!!!!!!!!!1", h.toString());
    }
    
    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(200, h.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        h.upgradeSpeed();
        assertEquals(250, h.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        h.downgradeSpeed();
        assertEquals(150, h.getMaxSpeed());
    }

}