package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {

    @Test

    public void sum()
    {
        Sum sum = new Sum();
        int result = sum.Add(4, new int[]{12, 23, 2, 4});
        assertEquals(41,result);
    }
}
