package edu.estatuas.stockx;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SneakerTest {

    private Sneaker sneaker;

    @Before
    public void setUp() {
        sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
    }

    @Test
    public void testGetStyle() {
        assertEquals("555088-105", sneaker.getStyle());
    }

    @Test
    public void testGetName() {
        assertEquals("Jordan 1 Retro High Dark Mocha", sneaker.getName());
    }

    @Test
    public void testGetAndSetBid() {
        sneaker.setBid(500);
        assertEquals(500, sneaker.getBid());
    }

    @Test
    public void testGetAndSetAsk() {
        sneaker.setAsk(600);
        assertEquals(600, sneaker.getAsk());
    }

    @Test
    public void testGetAndSetSale() {
        sneaker.setSale(700);
        assertEquals(700, sneaker.getSale());
    }

    @Test
    public void testToString() {
        assertEquals("Jordan 1 Retro High Dark Mocha 555088-105", sneaker.toString());
    }
}
