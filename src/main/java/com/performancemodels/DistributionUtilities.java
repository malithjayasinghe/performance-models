package com.performancemodels;

import java.io.*;

/**
 * Created by temp on 1/26/17.
 */
public class DistributionUtilities {

    public static double getMean(int i, String FileName) {

        String sLineValue;
        int moment = i;
        BufferedReader reader;
        double sum = 0;
        double count = 0;
        double mean;
        if (moment==1) {
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
        } else {
            System.out.println("vvvvvvvvvvv");
        }
        mean = sum / count;
        return mean;

    }
}



