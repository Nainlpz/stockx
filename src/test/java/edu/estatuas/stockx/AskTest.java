package edu.estatuas.stockx;

import edu.estatuas.stockx.Item.Ask;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AskTest {

    private Ask ask;

    @Before
    public void setUp() {
        ask = new Ask("9.5", 300);
    }

    @Test
    public void testSize() {
        assertEquals("9.5", ask.size());
    }

    @Test
    public void testValue() {
        assertEquals(300, ask.value());
    }

    @Test
    public void testCompareTo() {
        Ask higherAsk = new Ask("9.5", 350);
        Ask lowerAsk = new Ask("9.5", 250);
        assertTrue(ask.compareTo(higherAsk) < 0);
        assertTrue(ask.compareTo(lowerAsk) > 0);
        assertTrue(ask.compareTo(ask) == 0);
    }

    @Test
    public void testToString() {
        assertEquals("\t\t9.5\t300\n", ask.toString());
    }
}