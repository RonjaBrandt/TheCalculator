package com.thecalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathTest {

    @Test
    public void add() {
        Math math = new Math();
        assertEquals(0,math.add(1,1));


        //See if Java can add
        long sum = 10 + 11;
        assertEquals(sum, 10 + 11);

    }

    @Test
    public void subtract() {
        Math math = new Math();
        assertEquals(0, math.subtract(1, 1));


        //See if Java can subtract
        //long sum = 10-9;
        //assertEquals(sum, 10-9);
    }

    @Test
    public void multiplication() {
        Math math = new Math();
        assertEquals(1, math.multiplication(1,1));
    }
}