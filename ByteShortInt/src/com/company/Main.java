package com.company;

public class Main {

    public static void main(String[] args) {
        //Variables

        //int has a width of 32
        int myMinValue = -214_748_3648;
        int myMaxValue = 214_7483_647;
        int myTotal = (myMaxValue)/2;
        System.out.println("Total: " + myTotal);

        //byte has a width of 8
        byte myMaxByteValue = 127;
        byte myMinByteValue = (byte) (-128/2);//Type casting to read the value as a type

        //short has a width of 16
        short myMaxShort = 32767;
        short myShortValue = 32767;

        //long has a width of 64
        long myMinLongValue = 9_223_373_036_854_775_80L;

    }
}
