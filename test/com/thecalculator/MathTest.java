package com.thecalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathTest {

    @Test
    public void add() {
        Math math = new Math();

        assertEquals(0,math.add(1,1));


    }

    @Test
    public void subtract() {
        Math math = new Math();

        assertEquals(0,math.subtract(1,1));
    }
}