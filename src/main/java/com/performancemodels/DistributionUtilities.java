package com.performancemodels;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by temp on 1/26/17.
 */
public class DistributionUtilities {

    public static double getMoment(int i, String FileName) {
        String sCurrentLine = null;
        BufferedReader reader = null;
        double sigmaX = 0,moment_result;
        double x,n=0;
        // lets fire up a buffered reader and skip right to that spot.
        try {
            reader = new BufferedReader(new FileReader(FileName));
            while ((sCurrentLine = reader.readLine()) != null) {
                n++;
                x = Double.parseDouble(sCurrentLine);
                sigmaX += Math.pow(x, i);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        moment_result = (sigmaX / n);
        return moment_result;
    }
}



