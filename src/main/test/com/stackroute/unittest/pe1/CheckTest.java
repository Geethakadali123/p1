package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void Check()
    {
        Check check = new Check();
        String result = check.Check(25);
        assertEquals("Tom",result);
    }
}
