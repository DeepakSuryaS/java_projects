package com.company;

public class Main {

    public static void main(String[] args) {
        float minFloatVal = Float.MIN_VALUE;
        float maxFloatVal = Float.MAX_VALUE;
        System.out.println("Min float val = " + minFloatVal);
        System.out.println("Max float val = " + maxFloatVal);

        double minDoubleVal = Double.MIN_VALUE;
        double maxDoubleVal = Double.MAX_VALUE;
        System.out.println("Min double val = " + minDoubleVal);
        System.out.println("Max double val = " + maxDoubleVal);

        int intVal = 5;
        float floatVal = 5.25f;
        double doubleVal = 5.25d;

        // lbs to kg
        double numOfPounds = 200d;
        double numOfKilos = numOfPounds * 0.45359237d;
        System.out.println("Number of kilos = " + numOfKilos);

    }
}
