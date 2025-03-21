package edu.estatuas.stockx;

import edu.estatuas.stockx.Item.Bid;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BidTest {

    private Bid bid;

    @Before
    public void setUp() {
        bid = new Bid("9.5", 300);
    }

    @Test
    public void testSize() {
        assertEquals("9.5", bid.size());
    }

    @Test
    public void testValue() {
        assertEquals(300, bid.value());
    }

    @Test
    public void testCompareTo() {
        Bid higherBid = new Bid("9.5", 350);
        Bid lowerBid = new Bid("9.5", 250);
        assertTrue(bid.compareTo(higherBid) < 0);
        assertTrue(bid.compareTo(lowerBid) > 0);
        assertTrue(bid.compareTo(bid) == 0);
    }

    @Test
    public void testToString() {
        assertEquals("\t\t9.5\t300\n", bid.toString());
    }
}