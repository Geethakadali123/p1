package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PatternTest {


    @Test

    public void Pattern()
    {
        Pattern pattern = new Pattern();
        int result = pattern.Pattern(3);
        assertEquals(122333,result);
    }
}

