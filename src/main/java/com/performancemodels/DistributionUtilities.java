package com.performancemodels;

import java.io.*;

/**
 * Created by temp on 1/26/17.
 */
public class DistributionUtilities {

    public static double getMean(int i, String FileName){

        String text = null;
        BufferedReader reader = null;
        double sum=0;
        double count=0;
        double mean=0;
        try {
            reader = new BufferedReader(new FileReader(FileName));
            while ((text = reader.readLine()) != null) {

                sum=sum+Double.parseDouble(text);

                count++;



            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            }
        }
        mean=sum/count;
       System.out.println(""+sum+"   "+mean);


        return mean;



    }
}



