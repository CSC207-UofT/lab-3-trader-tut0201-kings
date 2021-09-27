/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class ChildTest {
    Child c;

    @Before
    public void setUp() throws Exception {
        c = new Child();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Mommy! Daddy! Where are you? I'm scared...", c.sound());
    }

    @Test(timeout = 50)
    public void TestGetAge() {
        assertEquals(8, c.getAge());
    }

    @Test(timeout = 50)
    public void TestCry() {
        c.cry();
        assertEquals("Waaaaaaaah!", c.cry());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(20, c.getPrice());
    }

}