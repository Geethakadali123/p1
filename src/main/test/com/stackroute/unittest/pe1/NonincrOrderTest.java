package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class NonincrOrderTest {

    @Test

    public void NonIncr()
    {
        NonincrOrder order = new NonincrOrder();
        int result = order.Order(234534);
        assertEquals(544332,result);
    }
}
