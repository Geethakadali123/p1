package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;


public class CharCheckTest {

    @Test
    public void CheckTest()
    {
        Charcheck charcheck = new Charcheck();
        String result = charcheck.Charcheck("ap");
        assertEquals("vowelconsonant",result);

    }
    @Test
    public void CheckTest1()
    {
        Charcheck charcheck = new Charcheck();
        String result = charcheck.Charcheck("p");
        assertEquals("consonant",result);
    }

}
