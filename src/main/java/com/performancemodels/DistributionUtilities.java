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
        double count = 0;
        double mean;
            try {
                reader = new BufferedReader(new FileReader(FileName));
                while ((sLineValue = reader.readLine()) != null) {
                    sum = sum + Double.parseDouble(sLineValue);
                    count++;
                }
                reader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        mean = sum / count;
        return mean;
    }
}



