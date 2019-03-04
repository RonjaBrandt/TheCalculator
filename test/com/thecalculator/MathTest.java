package com.thecalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathTest {

    @Test
    public void add() {
        Math math = new Math();
        assertEquals(2,math.add(1,1));


        //See if Java can add
        long sum = 10 + 11;
        assertEquals(sum, 10 + 11);

    }

    @Test
    public void subtract() {
        Math math = new Math();
        assertEquals(1, math.subtract(2, 1));


        //See if Java can subtract
        //long sum = 10-9;
        //assertEquals(sum, 10-9);
    }

    @Test
    public void multiplication() {
        Math math = new Math();
        assertEquals(1, math.multiplication(1,1));

        //See if Java can do Multiplication
        //long sum =2*3;
        //assertEquals(sum, 2*3);
    }

    @Test
    public void divide() {
        Math math = new Math();
        assertEquals(1,math.divide(2,2));

        //See if Java can divide
        long sum =2/2;
        assertEquals(sum,2/2);
    }
}