/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import static org.junit.Assert.*;

import org.junit.*;

public class PenguinTest {
    Penguin p;

    @Before
    public void setUp() throws Exception {
        p = new Penguin();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("MEEP", p.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10000000, p.getPrice());
    }

    @Test(timeout = 50)
    public void TestGetName() {
        assertEquals("Rico", p.getName());
    }
}
