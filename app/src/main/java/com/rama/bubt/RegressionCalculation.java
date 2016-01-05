package com.rama.bubt;

import java.text.DecimalFormat;

public class RegressionCalculation {

    private static double b1;
    private static double b0;

    public static void regression(int[][] values) {
        int sumX = 0;
        int sumY = 0;
        double meanX = 0;
        double meanY = 0;
        double squreSumXX = 0;
        double sumOfXXYY = 0;
        for (int i = 0; i < values.length; i++) {
            sumX += values[i][0];
            sumY += values[i][1];
        }

        meanX = sumX / values.length;
        meanY = sumY / values.length;

        meanX = sumX / values.length;
        meanY = sumY / values.length;

        for (int i = 0; i < values.length; i++) {
            squreSumXX += Math.pow((values[i][0] - meanX), 2);
            sumOfXXYY += ((values[i][0]) - meanX) * ((values[i][1]) - meanY);
        }

        b1 = sumOfXXYY / squreSumXX;
        b0 = meanY - (b1 * meanX);

    }

    public static String getSlope() {
        String s = new DecimalFormat("###.###").format(b1);
        return s;
    }

    public static String getIntercept() {
        String tempB0 = new DecimalFormat("###.###").format(b0);
        return tempB0;
    }

}
