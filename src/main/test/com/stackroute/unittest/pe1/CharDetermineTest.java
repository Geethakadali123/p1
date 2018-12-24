package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;
import java.lang.String;

public class CharDetermineTest {

    @Test
    public void DetermineTest()
    {
        CharDetermine determine = new CharDetermine();
        String result = determine.Determine('1');
        assertEquals("Digit",result);
    }
}
