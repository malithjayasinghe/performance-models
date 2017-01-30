package com.performancemodels;

import java.io.*;

/**
 * Created by temp on 1/26/17.
 */
public class DistributionUtilities {

    public static double getMean(String FileName) {

        String sLineValue;
        BufferedReader reader;
        double sum = 0;
        double n = 0;
        double mean;
            try {
                reader = new BufferedReader(new FileReader(FileName));
                while ((sLineValue = reader.readLine()) != null) {
                    sum = sum + Double.parseDouble(sLineValue);
                    n++;
                }
                reader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        mean = sum / n;
        return mean;
    }
}



