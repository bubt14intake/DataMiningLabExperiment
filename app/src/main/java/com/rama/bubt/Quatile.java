package com.rama.bubt;


import java.util.Arrays;

public class Quatile {
    static int[] numbers;
    static int median;
    static int q1;
    static int q3;
    static int interRange;

    public static void quatileCalculaion(String values) {

        StringBuilder stringBuilder = new StringBuilder();
        String[] tempVaues;
        tempVaues = values.split(" ");

        for (int i = 0; i < tempVaues.length; i++) {
            stringBuilder.append(tempVaues[i]);
        }
        String getInput = String.valueOf(stringBuilder);

        String[] tempNumber;
        String delimiter = ",";
        tempNumber = getInput.split(delimiter, -1);

        numbers = new int[tempNumber.length];

        for (int i = 0; i < tempNumber.length; i++) {
            numbers[i] = Integer.parseInt(tempNumber[i]);
        }
        Arrays.sort(numbers);
        median = (numbers.length + 1) / 2;
        q1 = (numbers.length + 1) / 4;
        q3 = 3 * (numbers.length + 1) / 4;
        interRange = q3 - q1;

    }


    public static int getNumbers() {
        return numbers.length;
    }

    public static int getMedian() {

        return numbers[median];
    }

    public static int getInterQuatileRange() {

        return numbers[interRange];
    }

    public static int getQ1() {

        return numbers[q1];
    }

    public static int getQ3() {
        return numbers[q3];
    }
}
