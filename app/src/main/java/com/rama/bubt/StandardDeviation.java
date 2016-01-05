package com.rama.bubt;

import java.text.DecimalFormat;

public class StandardDeviation {

    private static int[] numbers;
    private static double mean;
    private static double variance;
    private static double deviation;

    public static void standardDeviation(String values) {

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

        int sum = 0;

        for (int i = 0; i < tempNumber.length; i++) {

            numbers[i] = Integer.parseInt(tempNumber[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        mean = sum / Double.valueOf(numbers.length);

        double sumXi_means = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumXi_means += Math.pow(numbers[i] - mean, 2);
        }

        variance = sumXi_means / (numbers.length - 1);

        deviation = Math.sqrt(variance);

    }

    public static String getMeans() {
        String temMean = new DecimalFormat("####.####").format(mean);

        return temMean;
    }

    public static int getNumbers() {
        return numbers.length;
    }

    public static String getVariance() {
        String tempVeriance = new DecimalFormat("####.####").format(variance);
        return tempVeriance;
    }

    public static String getDeviation() {
        String tempDerivation = new DecimalFormat("####.####").format(deviation);
        return tempDerivation;
    }
}
