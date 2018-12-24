package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test

    public void palin()
    {
        Palindrome pal = new Palindrome();
        int result = pal.Palindrome(2468642);
        assertEquals(2468642,result);
    }
}
