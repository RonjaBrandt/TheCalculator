package com.thecalculator;

public class Math implements Add, Subtract, Divide {


    @Override
    public long add(long number1, long number2) {
        long sum = number1+number2;
        return sum;
    }

    @Override
    public long subtract(long number1, long number2) {
        long sum = number1-number2;
        return sum;
    }

    @Override
    public long divide(long number1, long number2) {
        long sum = number1/number2;
        return sum;
    }
}
