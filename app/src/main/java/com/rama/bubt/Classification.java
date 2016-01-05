package com.rama.bubt;

import java.text.DecimalFormat;

public class Classification {

    private static int[] numbers;
    private static double mean;
    private static double variance;
    private static double deviation;
    private static double py, pn;
    private static String byes;

    public static void classificationDerivation(String values) {

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

    public static String getAvg() {
        String temMean = new DecimalFormat("####.####").format(mean);

        return temMean;
    }

    public static int getLength() {
        return numbers.length;
    }

    public static String getVariance() {
        String tempVeriance = new DecimalFormat("####.####").format(variance);
        return tempVeriance;
    }

    public static String getStDeviation() {
        String tempDerivation = new DecimalFormat("####.####").format(deviation);
        return tempDerivation;
    }

    public static void probability(int num, double stY, double stN, double avgY, double avgN, double Ny, double Nn) {

        py = (1 / (Math.sqrt(2 * 3.14) * stY)) * Math.exp(-Math.pow((num - avgY), 2) / (2 * Math.pow(stY, 2)));
        pn = (1 / (Math.sqrt(2 * 3.14) * stN)) * Math.exp(-Math.pow((num - avgN), 2) / (2 * Math.pow(stN, 2)));

        py = py * (Ny / (Ny + Nn));
        pn = pn * (Nn / (Ny + Nn));

        py = py / (py + pn) * 100;
        pn = pn / (py + pn) * 100;

        if (py > pn) {
            byes = "Buy Computer";
        } else {
            byes = "Don't buy Computer";
        }

    }

    public static String getPy() {
        String tempPy = new DecimalFormat("####.####").format(pn);
        return tempPy;
    }

    public static String getPn() {
        String tempPn = new DecimalFormat("####.####").format(py);
        return tempPn;
    }

    public static String getByes() {

        return byes;
    }
}
