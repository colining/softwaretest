package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by asus on 2016/11/28.
 */
public class SqrtTest {
    @Test
    public void sqrt() throws Exception {
        Sqrt sqrt= new Sqrt();
        assertTrue(sqrt.sqrt(-1)==-1);
        assertTrue(sqrt.sqrt(4)==2.0);
    }
}