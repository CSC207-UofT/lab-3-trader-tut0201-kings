/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SledTest {
    Sled s;

    @Before
    public void setUp() throws Exception {
        s = new Sled();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(2, s.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        s.upgradeSpeed();
        assertEquals(3, s.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        s.downgradeSpeed();
        assertEquals(1, s.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetColor() {
        assertEquals("red", s.getColor());
    }

    @Test(timeout = 50)
    public void TestPaint() {
        s.paint("blue");
        assertEquals("blue", s.getColor());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(5, s.getPrice());
    }

}