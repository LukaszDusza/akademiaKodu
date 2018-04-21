package demo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {
    Utilities utilities;
    @Before
    public void setup() {
        utilities = new Utilities();
    }

    @Test
    public void everyNthChar() {
        char[] output = utilities.everyNthChar(new char[] {'h', 'e', 'l', 'l','o'}, 2);
      //  assertEquals(new char[] {'e', 'l'}, output);
        assertArrayEquals(new char[] {'e', 'l'}, output);
    }

    @Test
    public void removePairs() {
        assertEquals("ABCDEF", utilities.removePairs("AABBCDEEFF"));
        assertEquals("ABCD", utilities.removePairs("AABBCCDD"));
    }

    @Test
    public void converter() {
        assertEquals(300, utilities.converter(10,5));
    }

    @Test
    public void nullOfOddLenth() {
        assertNull(utilities.nullOfOddLenth("odd"));
        assertNotNull(utilities.nullOfOddLenth("even"));
    }
}