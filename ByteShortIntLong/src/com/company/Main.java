package com.company;

public class Main {

    public static void main(String[] args) {
        int myVal = 10000;

        int myMinVal = Integer.MIN_VALUE;
        int myMaxVal = Integer.MAX_VALUE;
        System.out.println("Max value = " + myMaxVal);
        System.out.println("Min value = " + myMinVal);
        System.out.println("Busted Max value = " + (myMaxVal + 1));
        System.out.println("Busted Min value = " + (myMinVal - 1));

        byte minByteVal = Byte.MIN_VALUE;
        byte maxByteVal = Byte.MAX_VALUE;
        System.out.println("Max value = " + maxByteVal);
        System.out.println("Min value = " + minByteVal);

        short minShortVal = Short.MIN_VALUE;
        short maxShortVal = Short.MAX_VALUE;
        System.out.println("Max value = " + maxShortVal);
        System.out.println("Min value = " + minShortVal);

        long myLong = 100L;
        long minLongVal = Long.MIN_VALUE;
        long maxLongVal = Long.MAX_VALUE;
        System.out.println("Max value = " + maxLongVal);
        System.out.println("Min value = " + minLongVal);

        int myTotal = (myMinVal / 2);

        byte myByteVal = (byte)(minByteVal / 2);

        short myShortVal = (short)(minShortVal / 2);

        // task
        byte newByteVal = 120;
        short newShortVal = 30000;
        int newIntVal = 100000;
        long newLongVal = 50000L + 10L * (newByteVal + newShortVal + newIntVal); // long works with int so no need of casting, this is because an int value will always fit in a long
        System.out.println("new long val = " + newLongVal);

        short shortTotal = (short)(1000 + 10 * (newByteVal + newShortVal + newIntVal)); // short is smaller than int so cast it, this is because an int value will never fit in a short
    }
}
