package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test

    public void rev()
    {
        ReverseString rev = new ReverseString();
        String result = rev.Reverse("London");
        assertEquals("nodnoL",result);
    }

}
