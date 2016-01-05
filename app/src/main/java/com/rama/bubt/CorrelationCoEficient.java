package com.rama.bubt;

import java.text.DecimalFormat;

/**
 * Created by Dipangker on 12/28/2015.
 */
public class CorrelationCoEficient {
    public static String correlation(int[][] values) {
        int sumX = 0;
        int sumY = 0;
        int sumXY = 0;
        int squreSumX = 0;
        int squreSumY = 0;
        for (int i = 0; i < values.length; i++) {

            sumXY += values[i][0] * values[i][1];
            squreSumX += Math.pow(values[i][0], 2);
            squreSumY += Math.pow(values[i][1], 2);
            sumX += values[i][0];
            sumY += values[i][1];
        }

        double r = ((values.length * sumXY - sumX * sumY)) / ((Math.sqrt((values.length * squreSumX) - (sumX * sumX)) *
                Math.sqrt((values.length * squreSumY) - (sumY * sumY))));

        String tempDerivation  = new DecimalFormat("####.####").format(r);
        return tempDerivation;
    }
}
