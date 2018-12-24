package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;
public class RepeatTest {

    @Test
    public void rep()
    {
        Repeat repeat = new Repeat();
        String result = repeat.Repeat("Geetha",2);
        assertEquals("Geethahaha",result);

    }
    @Test
    public void repFailure()
    {
        Repeat repeat = new Repeat();
        String result = repeat.Repeat("Geetha",2);
        assertEquals("Geethaahah",result);

    }

}
